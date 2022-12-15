package racingcar.domain;

import racingcar.constants.WinnersConstants;

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

    public String getWinnerNames() {
        StringBuilder names = new StringBuilder();

        for (Car winner : winners) {
            names.append(WinnersConstants.WINNER_NAME_SEPARATOR).append(winner.getName());
        }

        String namesString = names.toString();
        return namesString.replaceFirst(WinnersConstants.WINNER_NAME_SEPARATOR, WinnersConstants.BLANK);
    }
}