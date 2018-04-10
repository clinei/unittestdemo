package ee.tptlive.agiilsed.unittestdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void evaluate_0_IfInputIsNull() {
        // given
        String input = null;

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_0_IfInputIsEmpty() {
        // given
        String input = "";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNumber() {
        // given
        String input = "100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNegativeNumber() {
        // given
        String input = "-100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(-100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsSingleSumOperation() {
        // given
        String input = "56+44";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperation() {
        // given
        String input = "56+44+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(250, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNegativeNumbers() {
        // given
        String input = "-50+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

}