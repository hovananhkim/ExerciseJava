package ArrayTest;

import Array.Array12;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        assertEquals(new Array12().arrayEquals(shuffle(a6), a6), true);
        assertEquals(new Array12().arrayEquals(shuffle(a7), a7), true);
        assertEquals(new Array12().arrayEquals(shuffle(a8), a8), true);
    }
    
    private static int[] shuffle(int[] array){
        Integer[] intArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        return intList.stream().mapToInt(i->i).toArray();
    }
}
