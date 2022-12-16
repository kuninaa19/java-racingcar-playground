package racingcar.domain;

import java.util.Objects;

public class Position {
    private static final int INITIAL_POSITION = 0;
    private static final String GUI_POSITION = "-";

    private final int position;

    public Position() {
        this(INITIAL_POSITION);
    }

    public Position(int position) {
        this.position = position;
    }

    public Position move() {
        return new Position(position + 1);
    }

    public boolean largerThan(Position maxPosition) {
        return position > maxPosition.getPosition();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        StringBuilder positionUI = new StringBuilder();

        for (int i = 0; i < position; i++) {
            positionUI.append(GUI_POSITION);
        }

        return positionUI.toString();
    }
}
