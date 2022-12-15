package racingcar.domain;

import racingcar.constants.CarConstants;
import racingcar.messages.ErrorMessages;

public class Name {
    private final String name;

    public Name(String name) {
        checkNameSize(name);

        this.name = name;
    }

    private void checkNameSize(String carName) {
        if (carName.length() > CarConstants.CAR_NAME_SIZE) {
            throw new IllegalArgumentException(ErrorMessages.CAR_NAME_SIZE_EXCEPTION);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
