import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Array10Test {
    @Test
    public void test_addNumber() {
        int[] input = {1, 2, 3, 9, 12, 13};
        int[] output = {1, 2, 3, 5, 9, 12, 13};
        int[] output2 = {1, 2, 3, 3, 9, 12, 13};
        int[] output3 = {0, 1, 2, 3, 9, 12, 13};
        int[] output4 = {1, 2, 3, 9, 12, 13, 15};
        assertArrayEquals(new Array10().insertNumber(input, 5), output);
        assertArrayEquals(new Array10().insertNumber(input, 3), output2);
        assertArrayEquals(new Array10().insertNumber(input, 0), output3);
        assertArrayEquals(new Array10().insertNumber(input, 15), output4);
    }
}
