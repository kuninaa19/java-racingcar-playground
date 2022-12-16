package racingcar.domain;

import racingcar.constants.MoveConstants;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int randomNumber) {
        if (moveCondition(randomNumber)) {
            position = position.move();
        }
    }

    private boolean moveCondition(int randomNumber) {
        return randomNumber >= MoveConstants.MOVE_CONDITION;
    }

    public Position getMaxPosition(Position maxPosition) {
        if (position.largerThan(maxPosition)) {
            return position;
        }

        return maxPosition;
    }

    public boolean samePosition(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public String getName() {
        return name.toString();
    }

    @Override
    public String toString() {
        return name + " : " + position + "\n";
    }
}
