package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    void 초기화() {
        assertThat(new Position()).isEqualTo(new Position());
    }

    @Test
    void 이동() {
        Position position = new Position();
        assertThat(position.move()).isEqualTo(new Position(1));
    }

    @Test
    void 위치표시() {
        Position position = new Position(1);
        assertThat(position.toString()).isEqualTo("-");
    }
}