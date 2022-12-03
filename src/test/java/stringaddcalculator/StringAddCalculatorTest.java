package stringaddcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringAddCalculatorTest {
    @Test
    public void sum_null_또는_빈문자() {
        assertThat(StringAddCalculator.sum(null)).isEqualTo(0);
        assertThat(StringAddCalculator.sum("")).isEqualTo(0);
    }

    @Test
    public void sum_숫자하나() {
        assertThat(StringAddCalculator.sum("1")).isEqualTo(1);
    }

    @Test
    public void sum_쉼표구분자() {
        assertThat(StringAddCalculator.sum("1,2")).isEqualTo(3);
    }

    @Test
    public void sum_쉼표_또는_콜론_구분자() {
        assertThat(StringAddCalculator.sum("1,2:3")).isEqualTo(6);
    }

    @Test
    public void sum_custom_구분자() {
        assertThat(StringAddCalculator.sum("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    public void sum_exception() {
        assertThatThrownBy(() -> StringAddCalculator.sum("-1,2,3"))
                .isInstanceOf(RuntimeException.class).hasMessage("양의 정수만 포함가능합니다");

        assertThatThrownBy(() -> StringAddCalculator.sum("a,2,3"))
                .isInstanceOf(RuntimeException.class).hasMessage("양의 정수만 포함가능합니다");
    }
}
