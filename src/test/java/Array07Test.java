import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array07Test {
    @Test
    public void test() {
        int[] input = {1, 0, 6, 8, 2, 3, 0};
        int[] output = {0, 6, 8};
        assertEquals(Arrays.equals(new Array07().findArrayAscLongest(input),output), true);
//        new Array07().findArrayAscLongest(input);
    }
}
