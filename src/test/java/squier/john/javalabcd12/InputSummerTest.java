package squier.john.javalabcd12;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/12/17.
 */
public class InputSummerTest {

    InputSummer inputSummer;

    @Before
    public void setup() { inputSummer = new InputSummer(); }

    @Test
    public void inputSummerTestPositive() {
        int expected = 55;
        int actual = inputSummer.sumUpToInput(10);
        Assert.assertEquals("I expect actual to be 55", expected, actual);
    }

    @Test
    public void inputSummerTestNegative() {
        int expected = -2;
        int actual = inputSummer.sumUpToInput(-2);
        Assert.assertEquals("I expect actual to be -1", expected, actual);
    }

    @Test
    public void inputSummerTestZero() {
        int expected = 0;
        int actual = inputSummer.sumUpToInput(0);
        Assert.assertEquals("I expect actual to be 0", expected, actual);
    }

}
