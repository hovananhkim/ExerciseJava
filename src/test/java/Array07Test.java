import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Array07Test {
    @Test
    public void test() {
        int[] input = {1, 0, 6, 8, 2, 3, 0};
        int[] output = {0, 6, 8};
        assertArrayEquals(new Array07().findArrayAscLongest(input),output);
    }
}
