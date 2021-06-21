import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array03Test {
    @Test
    public void test_evenSubOdd() {
        int[] array = {1, 2, 3, 4, 8, 7, 4, 1};
        assertEquals(new Array03().evenSubOdd(array), 6);
    }
}
