package squier.john.javalabcd12;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/13/17.
 */
public class InputFactorialTest {

    InputFactorial inputFactorial;

    @Before
    public void setup() { inputFactorial = new InputFactorial(); }

    @Test
    public void inputFactorialTestPositive() {
        int expected = 120;
        int actual = inputFactorial.calculateFactorial(5);
        Assert.assertEquals("I expect actual to be 120", expected, actual);
    }

    @Test
    public void inputFactorialTestNegative() {
        int expected = 0;
        int actual = inputFactorial.calculateFactorial(-5);
        Assert.assertEquals("I expect actual to be 0", expected, actual);
    }

    @Test
    public void inputFactorialTestZero() {
        int expected = 0;
        int actual = inputFactorial.calculateFactorial(0);
        Assert.assertEquals("I expect actual to be 0", expected, actual);
    }

}
