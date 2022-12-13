package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 자동차_초기_전진_값_0(){
        Car car = new Car("crong");

        assertThat(car.getPosition()).isEqualTo(0);
    }
}
