package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {
    @Test
    public void 단일_우승자_선정() {
        Car pobi = new Car("pobi");
        pobi.move(4);
        pobi.move(4);
        pobi.move(4);

        Car crong = new Car("crong");
        crong.move(4);

        Car honux = new Car("honux");
        honux.move(4);
        honux.move(4);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        Winners winners = new Winners(cars);

        assertThat(winners.getWinners()).isEqualTo(Arrays.asList(pobi));
    }

    @Test
    public void 공동_우승자_선정() {
        Car pobi = new Car("pobi");
        pobi.move(4);
        pobi.move(4);

        Car crong = new Car("crong");
        crong.move(4);

        Car honux = new Car("honux");
        honux.move(4);
        honux.move(4);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        Winners winners = new Winners(cars);

        assertThat(winners.getWinners()).isEqualTo(Arrays.asList(pobi, honux));
    }
}
