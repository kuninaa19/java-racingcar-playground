package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_이동() {
        Car crong = new Car("crong");
        crong.move(4);
        Position position = crong.getPosition();
        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_이동_실패() {
        Car crong = new Car("crong");
        crong.move(3);

        Position position = crong.getPosition();

        assertThat(position.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차_동일한_위치() {
        Car crong = new Car("crong");
        crong.move(4);
        crong.move(4);

        Car pobi = new Car("pobi");
        pobi.move(4);
        pobi.move(4);

        assertThat(crong.samePosition(pobi.getPosition())).isTrue();
    }
}
