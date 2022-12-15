package racingcar.messages;

import racingcar.constants.CarConstants;

public class ErrorMessages {
    public static final String CAR_NAME_SIZE_EXCEPTION = "[ERROR] 자동차 이름은 " + CarConstants.CAR_NAME_SIZE + "자 이하만 허용합니다.";
    public static final String MOVE_COUNT_TYPE_EXCEPTION = "[ERROR] 숫자를 입력해주세요.";
    public static final String MOVE_COUNT_VALUE_EXCEPTION = "[ERROR] 양수를 입력해주세요.";
}
