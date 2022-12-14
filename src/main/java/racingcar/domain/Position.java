package racingcar.domain;

import racingcar.constants.CarConstants;

public class Position {

    private final int position;

    public Position() {
        position = CarConstants.CAR_INITIAL_POSITION;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public Position move() {
        int position = this.position + 1;

        return new Position(position);
    }

    public boolean largerThan(Position maxPosition) {
        return position > maxPosition.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }
}
