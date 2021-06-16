import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array11Test {
    @Test
    public void test_findMaxSum() {
        int[] input = {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1};
        assertEquals(new Array11().findMaxSum(input), 23);
    }
}
