package racingcar.views;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winners;
import racingcar.messages.ConsoleMessages;

public class ResultView {
    public static void printInterval() {
        System.out.println();
    }

    public static void printResultGuide() {
        System.out.println(ConsoleMessages.PLAY_RESULT_GUIDE);
    }

    public static void printCarMoveResult(Cars cars) {
        System.out.println(cars.toString());
    }

    public static void printPlayWinners(Winners winners) {
        System.out.print(winners + ConsoleMessages.PLAY_RESULT_WINNERS);
    }
}
