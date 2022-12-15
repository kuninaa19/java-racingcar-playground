package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.Move;
import racingcar.inputs.Input;
import racingcar.views.ErrorView;
import racingcar.views.InputView;

public class FlowController {
    public void run() {
        Cars cars = createPlayingCars();
        Move playCount = getTryCount();
    }

    private Move getTryCount() {
        try {
            InputView.tryCountInputForm();

            return new Move(Input.read());
        } catch (IllegalArgumentException e) {
            ErrorView.printError(e.getMessage());
            return getTryCount();
        }
    }

    private Cars createPlayingCars() {
        try {
            InputView.carNameInputForm();

            return new Cars(Input.read());
        } catch (IllegalArgumentException e) {
            ErrorView.printError(e.getMessage());
            return createPlayingCars();
        }
    }
}
