import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
    private StringSolution solution = new StringSolution();

    @Test
    public void empty() {
        String res = solution.countAndSay(0);
        assertEquals("", res);
    }

    @Test
    public void one() {
        String res = solution.countAndSay(1);
        assertEquals("1", res);
    }

    @Test
    public void oneone() {
        String res = solution.countAndSay(2);
        assertEquals("11", res);
    }

    @Test
    public void ten() {
        String res = solution.countAndSay(10);
        assertEquals("13211311123113112211", res);
    }
}   