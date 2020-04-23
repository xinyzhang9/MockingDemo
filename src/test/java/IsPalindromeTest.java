import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsPalindromeTest {
    private IsPalindrome solution = new IsPalindrome();
    @Test
    public void trueCase() {
        String s = "A man, a plan, a canal: Panama";
        assertEquals(true, solution.run(s));
    }

    @Test
    public void falseCase() {
        String s = "race a car";
        assertEquals(false, solution.run(s));
    }
}