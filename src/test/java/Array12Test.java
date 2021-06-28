import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array12Test {
    @Test
    public void test_arrayEquals() {
        int[] a1 = {1, 2, 3, 6, 8, 7, 15, 20, 2};
        int[] a2 = {1, 2, 3, 5};
        int[] a3 = {1, 1, 6, 6, 8, 7, 15, 12, 2};
        int[] a4 = {1, 2, 6, 6, 8, 7, 15, 20, 2};
        int[] a5 = {1, 2, 3, 6, 8, 7, 15, 20, 2};
        int[] a6 = {1, 3, 3, 6, 8, 7, 15, 20, 2};
        int[] a7 = {1, 7, 3, 6, 8, 2, 15, 20, 2};
        int[] a8 = {1, 3, 3, 6, 8, 3, 15, 20, 2};
        assertEquals(new Array12().arrayEquals(a1, a2), false);
        assertEquals(new Array12().arrayEquals(a1, a3), false);
        assertEquals(new Array12().arrayEquals(a1, a4), false);
        assertEquals(new Array12().arrayEquals(a1, a5), true);
        assertEquals(new Array12().arrayEquals(a1, a6), false);
        assertEquals(new Array12().arrayEquals(a1, a7), true);
        assertEquals(new Array12().arrayEquals(a1, a8), false);
    }
}
