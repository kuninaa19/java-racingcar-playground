package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_이동() {
        Car crong = new Car("crong");
        crong.move(4);

        assertThat(crong.samePosition(new Position(1))).isTrue();
    }

    @Test
    void 자동차_이동_실패() {
        Car crong = new Car("crong");
        crong.move(3);

        assertThat(crong.samePosition(new Position(0))).isTrue();
    }

    @Test
    void 자동차_동일한_위치() {
        Car crong = new Car("crong", 2);

        assertThat(crong.samePosition(new Position(2))).isTrue();
    }

    @Test
    void 자동차_위치_비교() {
        Car crong = new Car("crong");

        assertThat(crong.getMaxPosition(new Position(3))).isEqualTo(new Position(3));
    }
}
