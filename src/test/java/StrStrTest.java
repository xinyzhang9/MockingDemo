import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrStrTest {
    private StringSolution solution = new StringSolution();
    @Test
    public void normal() {
        assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    public void notFound() {
        assertEquals(-1, solution.strStr("aaaaa", "aab"));
    }
}