import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtoiTest {
    private StringSolution solution = new StringSolution(); 

    @Test
    public void emptyValue() {
        String str = "";
        int res = solution.myAtoi(str);
        assertEquals(0, res);
    }

    @Test
    public void frontSpace() {
        String str = " ";
        int res = solution.myAtoi(str);
        assertEquals(0, res);
    }

    @Test
    public void normal() {
        String str = "42";
        int res = solution.myAtoi(str);
        assertEquals(42, res);
    }

    @Test
    public void negative() {
        String str = "-42";
        int res = solution.myAtoi(str);
        assertEquals(-42, res);
    }

    @Test
    public void positive() {
        String str = "+1";
        int res = solution.myAtoi(str);
        assertEquals(1, res);
    }

    @Test
    public void NumFollowedByNonNumeric() {
        String str = "123 and haha";
        int res = solution.myAtoi(str);
        assertEquals(123, res);
    }

    @Test
    public void nonNumericFollowedByNum() {
        String str = "word and 123";
        int res = solution.myAtoi(str);
        assertEquals(0, res);
    }

    @Test
    public void nonNumericFollowedByNegativeNum() {
        String str = "  -123aaa";
        int res = solution.myAtoi(str);
        assertEquals(-123, res);
    }

    @Test
    public void overFlowPositive() {
        String str = "12391283472332";
        int res = solution.myAtoi(str);
        assertEquals(Integer.MAX_VALUE, res);
    }

    @Test
    public void overFlowNegative() {
        String str = "-91283472332";
        int res = solution.myAtoi(str);
        assertEquals(Integer.MIN_VALUE, res);
    }

}