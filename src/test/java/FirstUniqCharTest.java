import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstUniqCharTest {
    private FirstUniqChar f = new FirstUniqChar();
    @Test
    public void test() {
        String s = "loveleetcode";
        assertEquals(2, f.run(s));
    }

    @Test
    public void empty() {
        String s = "";
        assertEquals(-1, f.run(s));
    }

    @Test
    public void oneLength() {
        String s = "z";
        assertEquals(0, f.run(s));
    }
    @Test
    public void notFound() {
        String s = "aadadaad";
        assertEquals(-1, f.run(s));
    }
}