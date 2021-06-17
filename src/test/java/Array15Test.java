import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array15Test {
    @Test
    public void test() {
        int[] input = {1, 6, -3, 9, 2};
        int[] output = {2, 6, 9};
        int[] input2 = {3, 1, 6, 9, 3};
        int[] output2 = {3, 9, 6};
        assertEquals(Arrays.equals(new Array15().findMaxArray(input, 3), output), true);
        assertEquals(Arrays.equals(new Array15().findMaxArray(input2, 3), output2), true);
    }
}
