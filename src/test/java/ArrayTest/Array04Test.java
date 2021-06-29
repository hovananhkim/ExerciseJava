package ArrayTest;

import Array.Array04;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Array04Test {
    @Test
    public void test_permultation() {
        int[] input = {1, 3, 2, 9, 4, 5, 7, 1, 6};
        int[] input2 = {1, 3, 5, 7, 6, 4, 2, 7, 9};
        assertArrayEquals(new Array04().sort(input), input);
        assertArrayEquals(new Array04().sort(input2), input2);
    }
}
