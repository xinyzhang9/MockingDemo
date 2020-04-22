import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RotateImageTest {
    @Test
    public void test() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        new RotateImage().rotate(matrix);
        assertEquals(7, matrix[0][0]);
        assertEquals(4, matrix[0][1]);
        assertEquals(1, matrix[0][2]);
        assertEquals(8, matrix[1][0]);
        assertEquals(5, matrix[1][1]);
        assertEquals(2, matrix[1][2]);
        assertEquals(9, matrix[2][0]);
        assertEquals(6, matrix[2][1]);
        assertEquals(3, matrix[2][2]);

    }
}