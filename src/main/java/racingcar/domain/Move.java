package racingcar.domain;

import racingcar.messages.ErrorMessages;

import java.util.Objects;

public class Move {
    private static final int MOVE_COUNT = 0;

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
        if (count <= MOVE_COUNT) {
            throw new IllegalArgumentException(ErrorMessages.MOVE_COUNT_VALUE_EXCEPTION);
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return count == move.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
