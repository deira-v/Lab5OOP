package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp()
    {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success()
    {
        assertEquals(20, calc.add(16, 4));
    }

    @Test
    public void testSub_Success()
    {
        assertEquals(12, calc.sub(16, 4));
    }

    @Test
    public void testMul_Success()
    {
        assertEquals(40, calc.mul(10, 4));
    }

    @Test
    public void testDiv_Success()
    {
        assertEquals(4, calc.div(16, 4));
    }



}
