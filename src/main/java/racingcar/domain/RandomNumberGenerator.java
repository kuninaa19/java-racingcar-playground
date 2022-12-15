package racingcar.domain;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static final int MIN = 0;
    public static final int MAX = 9;
    private static final Random random = ThreadLocalRandom.current();

    public static int randomNumberInRange() {
        return MIN + random.nextInt(MAX - MIN + 1);
    }
}