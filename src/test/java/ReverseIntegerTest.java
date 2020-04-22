import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {
    private ReverseInteger r = new ReverseInteger();
    @Test
    public void testPositive() { 
        assertEquals(321, r.reverse(123));
    }
    @Test
    public void testNegative() { 
        assertEquals(-321, r.reverse(-123));
    }
    @Test
    public void testPreZero() {
        assertEquals(21, r.reverse(120));
    }
    @Test
    public void testOverflow() {
        assertEquals(0, r.reverse(1534236469));
    }
}