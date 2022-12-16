package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.messages.ErrorMessages;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    void 이름_허용_길이_5자이하() {
        assertThat(new Name("crong")).isEqualTo(new Name("crong"));
    }

    @Test
    void 이름_선정_길이_에러() {
        assertThatThrownBy(() -> {
            Name FailCase = new Name("crong+");
        }).isInstanceOf(IllegalArgumentException.class).hasMessage(ErrorMessages.CAR_NAME_SIZE_EXCEPTION);
    }
}
