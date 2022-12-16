package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Winners {
    private static final String NAME_SEPARATOR = ",";

    private final List<String> winners;

    public Winners(Cars cars) {
        this.winners = createWinners(cars);
    }

    public Winners(List<String> winners) {
        this.winners = winners;
    }

    private static List<String> createWinners(Cars cars) {
        List<String> WinnerNames = new ArrayList<>();

        Position maxPosition = cars.getMaxPosition();

        List<Car> winners = cars.getWinners(maxPosition);

        for (Car car : winners) {
            WinnerNames.add(car.getName());
        }

        return WinnerNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winners winners1 = (Winners) o;
        return Objects.equals(winners, winners1.winners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winners);
    }

    @Override
    public String toString() {
        return String.join(NAME_SEPARATOR, winners);
    }
}