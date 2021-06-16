import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array04Test {
    @Test
    public void test_permultation() {
        int[] input = {1, 3, 2, 9, 4, 5, 7, 1, 6};
        int[] output = {2, 4, 6, 9, 7, 5, 3, 1, 1};
        assertEquals(Arrays.equals(new Array04().array04(input), output), true);
    }
}
