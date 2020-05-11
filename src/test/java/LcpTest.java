import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LcpTest {
    private StringSolution solution = new StringSolution();
    @Test
    public void normal() {
        String[] strs = new String[] {"flower", "flow", "flight"};
        String res = solution.longestCommonPrefix(strs);
        assertEquals("fl", res);
    }
}   