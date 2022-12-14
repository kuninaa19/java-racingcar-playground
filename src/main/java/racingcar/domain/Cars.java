package racingcar.domain;

import racingcar.constants.CarConstants;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputs) {
        cars = createCars(inputs);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private static List<Car> createCars(String inputs) {
        List<Car> tempCars = new ArrayList<>();
        String[] carNames = inputs.split(CarConstants.CAR_NAME_SEPARATOR);

        for (String carName : carNames) {
            Car car = new Car(carName);
            tempCars.add(car);
        }

        return tempCars;
    }

    public int count() {
        return cars.size();
    }

    public List<Car> getCars() {
        return cars;
    }

    public Position getMaxPosition() {
        Position maxPosition = new Position();

        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }

        return maxPosition;
    }
}
