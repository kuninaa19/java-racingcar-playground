package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void 쉼표기준으로_자동차_3개만들기() {
        Cars cars = new Cars("pobi,crong,honux");
        assertThat(cars.count()).isEqualTo(3);
    }
}
