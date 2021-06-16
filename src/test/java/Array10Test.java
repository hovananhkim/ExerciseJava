import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array10Test {
    @Test
    public void test_addNumber() {
        int[] input = {1, 2, 3, 9, 12, 13};
        int[] output = {1, 2, 3, 5, 9, 12, 13};

        assertEquals(Arrays.equals(new Array10().addNumber(input,5),output),true);
//        assertEquals(new Array10().addNumber(input,5),5);
    }
}
