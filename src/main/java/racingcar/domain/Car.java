package racingcar.domain;

import racingcar.constants.CarConstants;

public class Car {
    private final Name name;
    private int position;

    public Car(String carName) {
        this.name = new Name(carName);
        position = CarConstants.CAR_INITIAL_POSITION;
    }

    public int getPosition() {
        return position;
    }

    public void move(int number) {
        if (number >= CarConstants.CAR_MOVE_CONDITION) {
            this.position++;
        }
    }
}
