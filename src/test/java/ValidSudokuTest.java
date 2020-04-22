import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ValidSudokuTest {
    ValidSudoku s = new ValidSudoku();
    @Test
    public void test() {
        final char[][] input = { { '.', '.', '4', '.', '.', '.', '6', '3', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, { '5', '.', '.', '.', '.', '.', '.', '9', '.' },
                { '.', '.', '.', '5', '6', '.', '.', '.', '.' }, { '4', '.', '3', '.', '.', '.', '.', '.', '1' },
                { '.', '.', '.', '7', '.', '.', '.', '.', '.' }, { '.', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.', '.' } };
        assertEquals(false, s.isValidSudoku(input));
    }
}