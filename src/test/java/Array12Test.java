import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array12Test {
    @Test
    public void test_arrayEquals() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3, 4};
        int[] a4 = {2, 3, 4};
        assertEquals(new Array12().arrayEquals(a1, a2), true);
        assertEquals(new Array12().arrayEquals(a1, a3), false);
        assertEquals(new Array12().arrayEquals(a1, a4), false);
    }
}
