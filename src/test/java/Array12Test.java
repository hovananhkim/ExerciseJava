import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array12Test {
    @Test
    public void test_arrayEquals() {
        int[] a1 = {1, 2, 3, 6, 8};
        int[] a2 = {1, 2, 3, 5};
        int[] a3 = {16, 3, 12, 6, 8};
        int[] a4 = {3, 2, 3, 7, 8};
        int[] a5 = {3, 2, 3, 7, 8};
        int[] a6 = {3, 7, 3, 2, 8};
        assertEquals(new Array12().arrayEquals(a1, a2), false);
        assertEquals(new Array12().arrayEquals(a1, a3), false);
        assertEquals(new Array12().arrayEquals(a1, a4), false);
        assertEquals(new Array12().arrayEquals(a5, a4), true);
        assertEquals(new Array12().arrayEquals(a6, a4), true);
    }
}
