import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public final void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddValues() {
        int a = 0, b = 5;
        int result = calc.add(a, b);

        Assert.assertEquals(result, 5);
    }

    @Test
    public void shouldSubtractValues() {
        int a = 12, b = 5;
        int result = calc.subtract(a, b);

        Assert.assertEquals(result, 7);
    }

    @Test
    public void shouldMultiplyValues() {
        int a = 0, b = 5;
        int result = calc.multiply(a, b);

        Assert.assertEquals(result, 0);
    }


    @Test
    public void shouldDivideValues() {
        int a = 12, b = 6;
        int result = calc.divide(a, b);

        Assert.assertEquals(result, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowException() {
        int a = 3, b = 0;
        calc.divide(a, b);
    }

}
