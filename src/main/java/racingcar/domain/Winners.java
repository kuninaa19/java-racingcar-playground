package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<Car> winners;

    public Winners(Cars cars) {
        this.winners = createWinners(cars);
    }

    private static List<Car> createWinners(Cars cars) {
        List<Car> tempWinners = new ArrayList<>();

        Position maxPosition = cars.getMaxPosition();

        for (Car car : cars.getCars()) {
            addWinner(tempWinners, maxPosition, car);
        }

        return tempWinners;
    }

    private static void addWinner(List<Car> tempWinners, Position maxPosition, Car car) {
        if (car.samePosition(maxPosition)) {
            tempWinners.add(car);
        }
    }

    public List<Car> getWinners() {
        return winners;
    }
}