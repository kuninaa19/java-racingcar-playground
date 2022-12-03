package stringaddcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static final String REGEX = ",|:";
    public static final String PATTERN = "//(.)\n(.*)";

    public static int sum(String text) {
        if (checkStringEmpty(text)) {
            return 0;
        }

        String[] numberStrings = splitStrings(text);

        return getStringSum(numberStrings);
    }

    private static int getStringSum(String[] numberStrings) {
        int sum = 0;

        for (String numberString : numberStrings) {
            checkUnsignedInt(numberString);

            sum += Integer.parseInt(numberString);
        }

        return sum;
    }

    private static void checkUnsignedInt(String numberString) {
        char charAt = numberString.charAt(0);
        if (charAt - '1' < 0 || charAt - '1' > 9) {
            throw new RuntimeException("양의 정수만 포함가능합니다");
        }
    }

    private static String[] splitStrings(String text) {
        Matcher m = Pattern.compile(PATTERN).matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }

        return text.split(REGEX);
    }

    private static boolean checkStringEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
