package racingcar.domain;

import racingcar.constants.CarConstants;
import racingcar.messages.ErrorMessages;

public class Car {
    private final String name;
    private int position;

    public Car(String carName) {
        checkNameSize(carName);

        name = carName;
        position = CarConstants.CAR_INITIAL_POSITION;
    }

    private void checkNameSize(String carName) {
        if (carName.length() > CarConstants.CAR_NAME_SIZE) {
            throw new IllegalArgumentException(ErrorMessages.CAR_NAME_SIZE_EXCEPTION);
        }
    }

    public String getName() {
        return name;
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
