import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Array15Test {
    @Test
    public void test() {
        int[] input = {1, 6, -3, 9, 2, 9, 16};
        int[] output = {2, 6, 9, 9, 16};
        int[] input2 = {3, 1, 6, 9, 3, -7};
        int[] output2 = {3, 6, 9};
        assertArrayEquals(new Array15().findMaxArray(input, 5), output);
        assertArrayEquals(new Array15().findMaxArray(input2, 3), output2);
    }
}