package racingcar.domain;

import racingcar.constants.MoveConstants;
import racingcar.messages.ErrorMessages;

public class Move {
    private final int count;

    public Move(String count) {
        int moveCount = convertStringToInt(count);
        checkSignedInt(moveCount);

        this.count = moveCount;
    }

    private int convertStringToInt(String count) {
        try {
            return Integer.parseInt(count);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessages.MOVE_COUNT_TYPE_EXCEPTION);
        }
    }

    private void checkSignedInt(int count) {
        if (count <= MoveConstants.MOVE_COUNT) {
            throw new IllegalArgumentException(ErrorMessages.MOVE_COUNT_VALUE_EXCEPTION);
        }
    }

    public int getCount() {
        return count;
    }
}
