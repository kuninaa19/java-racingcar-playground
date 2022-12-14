package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    private Position position;

    @BeforeEach
    void setUp() {
        position = new Position();
    }

    @Test
    void 위치_초기_값_0() {
        assertThat(position.getPosition()).isEqualTo(0);
    }

    @Test
    void 이동_1회() {
        Position position = this.position.move();
        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void 이동_2회() {
        Position firstMovePosition = this.position.move();
        Position secondMoveposition = firstMovePosition.move();
        assertThat(secondMoveposition.getPosition()).isEqualTo(2);
    }

}