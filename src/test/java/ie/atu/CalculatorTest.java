package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    // Create a new class Before Each Test
    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    // Test Addiction
    @Test
    public void testAdd_Success()
    {
        assertEquals(20, calc.add(16, 4));
    }

    // Test Addiction for Failure
    @Test
    public void testAdd_Failure()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to integer.MAX_VALUE", ex.getMessage());
    }

    // Test Subtraction
    @Test
    public void testSub_Success()
    {
        assertEquals(12, calc.sub(16, 4));
    }

    // Test Subtraction for Failure
        @Test
    public void testSub_Failure()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.sub(Integer.MIN_VALUE, 1));
        assertEquals("Number cannot be smaller than or equal to integer.MIN_VALUE", ex.getMessage());
    }

    //Test Multiplication
    @Test
    public void testMul_Success()
    {
        assertEquals(40, calc.mul(10, 4));
    }

    //Test Multiplication for Failure
    @Test
    public void testMul_Failure()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to integer.MAX_VALUE", ex.getMessage());
    }

    // Test Division
    @Test
    public void testDiv_Success()
    {
        assertEquals(4, calc.div(16, 4));
    }

    // Test Division for Failure
    @Test
    public void testDiv_Failure()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.div(10, 0));
        assertEquals("Number cannot be divided by 0", ex.getMessage());
    }

}
