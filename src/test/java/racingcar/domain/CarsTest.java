package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 쉼표기준으로_자동차_3개만들기() {
        Cars cars = new Cars("pobi,crong,honux");

        assertThat(cars.count()).isEqualTo(3);
    }

    @Test
    void 포지션_가장_높은_값_가져오기() {
        Car crong = new Car("crong");
        crong.move(4);
        crong.move(4);
        crong.move(4);

        Car pobi = new Car("pobi");
        pobi.move(4);
        pobi.move(4);

        Cars cars = new Cars(Arrays.asList(crong, pobi));

        assertThat(cars.getMaxPosition()).isEqualTo(new Position(3));
    }
}
