package racingcar.domain;

import racingcar.constants.CarConstants;

public class Car {
    private final Name name;
    private Position position;

    public Car(String carName) {
        this.name = new Name(carName);
        this.position = new Position();
    }

    public void move(int randomNumber) {
        if (moveCondition(randomNumber)) {
            position = position.move();
        }
    }

    private boolean moveCondition(int randomNumber) {
        return randomNumber >= CarConstants.CAR_MOVE_CONDITION;
    }

    public Position getPosition() {
        return position;
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
}
