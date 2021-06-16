import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array08Test {
    @Test
    public void test_maxSub() {
        int[] input = {1, 2, 6, 3, 9, -1};
        assertEquals(new Array08().maxSub(input), 10);
    }

    @Test
    public void test_minSub() {
        int[] input = {1, 3, 6, 3, 9, -1};
        assertEquals(new Array08().minSub(input), 0);
    }
}
