package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("pobi,crong,honux");
    }

    @Test
    void 쉼표기준으로_자동차_3개만들기() {
        assertThat(cars.count()).isEqualTo(3);
    }

    @Test
    void 전진() {
        List<Car> dumpCars = this.cars.getCars();
        for (Car car : dumpCars) {
            car.move(4);
            assertThat(car.getPosition()).isEqualTo(1);
        }
    }

    @Test
    void 전진_실패() {
        List<Car> dumpCars = this.cars.getCars();
        for (Car car : dumpCars) {
            car.move(3);
            assertThat(car.getPosition()).isEqualTo(0);
        }
    }
}
