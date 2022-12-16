package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String NAME_SEPARATOR = ",";

    private final List<Car> cars;

    public Cars(String inputs) {
        cars = createCars(inputs);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private static List<Car> createCars(String inputs) {
        List<Car> tempCars = new ArrayList<>();
        String[] carNames = inputs.split(NAME_SEPARATOR);

        for (String carName : carNames) {
            Car car = new Car(carName);
            tempCars.add(car);
        }

        return tempCars;
    }

    public Position getMaxPosition() {
        Position maxPosition = new Position();

        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }

        return maxPosition;
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomNumberGenerator.randomNumberInRange());
        }
    }

    public int count() {
        return cars.size();
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        StringBuilder carsResult = new StringBuilder();

        for (Car car : cars) {
            carsResult.append(car);
        }

        return carsResult.toString();
    }
}
