package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    void 자동차_이름_선정_5자이하() {
        Name SuccessCase = new Name("crong");

        assertThat(SuccessCase.getName()).isEqualTo("crong");

        assertThatThrownBy(() -> {
            Name FailCase = new Name("crong+");
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차 이름은 5자 이하만 허용합니다.");
    }
}
