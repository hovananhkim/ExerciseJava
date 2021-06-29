package ArrayTest;

import Array.Array02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array02Test {
    @Test
    public void test_maxSumThreeNumber() {
        int[] array = {1, 2, -2, -3, 5, -12, 9};
        int[] array2 = {1, -5, -2, -3, 5, -12, 9};
        assertEquals(new Array02().maxSumThreeNumber(array), 16);
        assertEquals(new Array02().maxSumThreeNumber(array2), 15);
    }
}
