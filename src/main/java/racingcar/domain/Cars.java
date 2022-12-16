package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Car> getWinners(Position maxPosition) {
        return cars.stream().filter(car -> car.samePosition(maxPosition)).collect(Collectors.toList());
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
