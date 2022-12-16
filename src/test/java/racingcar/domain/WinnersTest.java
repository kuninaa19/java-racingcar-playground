package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {
    @Test
    public void 단일_우승자_선정() {
        Car pobi = new Car("pobi", 3);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 2);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        Winners winners = new Winners(cars);

        assertThat(winners).isEqualTo(new Winners(Arrays.asList("pobi")));
    }

    @Test
    public void 공동_우승자_선정() {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 2);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        Winners winners = new Winners(cars);

        assertThat(winners).isEqualTo(new Winners(Arrays.asList("pobi", "honux")));
    }

    @Test
    void 우승자_출력() {
        Winners winners = new Winners(Arrays.asList("pobi", "honux"));
        assertThat(winners.toString()).isEqualTo("pobi,honux");
    }
}
