package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    void 자동차_이름_선정_5자이하() {
        Car SuccessCase = new Car("crong");

        assertThat(SuccessCase.getName()).isEqualTo("crong");

        assertThatThrownBy(() -> {
            Car FailCase = new Car("crong+");
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("자동차 이름은 5자 이하만 허용합니다.");
    }

    @Test
    void 자동차_초기_전진_값_0(){
        Car car = new Car("crong");

        assertThat(car.getPosition()).isEqualTo(0);
    }
}
