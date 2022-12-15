package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.Move;
import racingcar.domain.Winners;
import racingcar.inputs.Input;
import racingcar.views.ErrorView;
import racingcar.views.InputView;
import racingcar.views.ResultView;

public class FlowController {
    public void run() {
        Cars cars = createPlayingCars();
        Move move = getTryCount();

        ResultView.printInterval();
        ResultView.printResultGuide();

        Winners winners = playing(cars, move);

        ResultView.printPlayWinners(winners);
    }

    private Winners playing(Cars cars, Move move) {
        for (int i = 0; i < move.getCount(); i++) {
            cars.move();
            ResultView.printCarMoveResult(cars);
        }

        return new Winners(cars);
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
