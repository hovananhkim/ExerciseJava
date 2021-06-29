package ArrayTest;

import Array.Array14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array14Test {
    @Test
    public void test_determinant() {
        int[][] input1 = {
                {1, 5},
                {2, 6}
        };
        int[][] input2 = {
                {1, 5, 3},
                {2, 6, 5},
                {3, 4, 7}
        };
        int[][] input3 = {{1}};
        int[][] input4 = {
                {1, 5, 3, 7},
                {2, 6, 5, 8},
                {3, 4, 7, 9},
                {3, 2, 1, 10}
        };
        assertEquals(new Array14().determinant(input1), -4);
        assertEquals(new Array14().determinant(input2), -3);
        assertEquals(new Array14().determinant(input3), 1);
        assertEquals(new Array14().determinant(input4), -111);
    }
}