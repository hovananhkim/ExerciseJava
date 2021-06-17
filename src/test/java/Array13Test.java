import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array13Test {
    @Test
    public void test_deleteRowCol() {
        int[][] input = {{1, 2, 3}, {3, 6, 7}, {3, 5, 7}};
        int[][] output = {{1, 3}, {3, 7}};
        int[][] output2 = {{2, 3}, {3, 7}};
        int[][] result = new Array13().deleteRowCol(input, 1, 1);
        assertEquals(new Array13().isEquals(result, output), true);
        assertEquals(new Array13().isEquals(result, output2), false);

    }
}
