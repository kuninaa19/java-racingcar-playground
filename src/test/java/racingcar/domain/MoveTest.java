package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.messages.ErrorMessages;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class MoveTest {
    @Test
    void 진행횟수_양수입력() {
        Move move = new Move("1");
        assertThat(move.getCount()).isEqualTo(1);
    }

    @Test
    void 진행횟수_음수() {
        assertThatThrownBy(() -> {
            Move move = new Move("-1");
        }).hasMessage(ErrorMessages.MOVE_COUNT_VALUE_EXCEPTION);
    }

    @Test
    void 진행횟수_0() {
        assertThatThrownBy(() -> {
            Move move = new Move("0");
        }).hasMessage(ErrorMessages.MOVE_COUNT_VALUE_EXCEPTION);
    }

    @Test
    void 진행횟수_숫자가_아님() {
        assertThatThrownBy(() -> {
            Move move = new Move("fwefw");
        }).hasMessage(ErrorMessages.MOVE_COUNT_TYPE_EXCEPTION);
    }
}
