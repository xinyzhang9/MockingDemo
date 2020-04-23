import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsAnagramTest {
    private IsAnagram solution = new IsAnagram();
    @Test
    public void test() {
         String s = "anagram";
         String t = "nagaram";
         assertEquals(true, solution.run(s,t));
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";
        assertEquals(false, solution.run(s,t));
   }
   @Test
   public void empty() {
    String s = "";
    String t = "";
    assertEquals(true, solution.run(s,t));
}
}