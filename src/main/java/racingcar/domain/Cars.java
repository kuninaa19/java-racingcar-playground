package racingcar.domain;

import racingcar.constants.CarConstants;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(String inputs) {
        cars = createCars(inputs);
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
}
