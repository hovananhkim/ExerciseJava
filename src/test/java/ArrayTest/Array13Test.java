package ArrayTest;

import Array.Array13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Array13Test {
    @Test
    public void test_deleteRowCol() {
        int[][] input = {
                {1, 2, 3},
                {3, 6, 7},
                {3, 5, 7}};
        int[][] output = {
                {1, 3},
                {3, 7}};
        int[][] output2 = {
                {6, 7},
                {5, 7}};
        int[][] output3 = {
                {1, 2},
                {3, 6}};
        assertArrayEquals(new Array13().deleteRowCol(input, 1, 1), output);
        assertArrayEquals(new Array13().deleteRowCol(input, 0, 0), output2);
        assertArrayEquals(new Array13().deleteRowCol(input, 2, 2), output3);
    }
}
