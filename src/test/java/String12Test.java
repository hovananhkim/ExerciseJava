import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String12Test {
    @Test
    public void test_createMaxNumberFormArray() {
        int[] input = {2, 3, 6, 21, 32, 34, 210, 61};
        int[] input2 = {4, 41, 3};
        assertEquals(new String12().createMaxNumberFromArray(input), "66134332221210");
        assertEquals(new String12().createMaxNumberFromArray(input2), "4413");
        assertEquals(new String12().createMaxNumberFromArray(new int[]{4, 42}), "442");
        assertEquals(new String12().createMaxNumberFromArray(new int[]{4, 45}), "454");
        assertEquals(new String12().createMaxNumberFromArray(new int[]{432, 43243}), "43243432");
        assertEquals(new String12().createMaxNumberFromArray(new int[]{8, 8}), "88");
        assertEquals(new String12().createMaxNumberFromArray(new int[]{34323,3432}), "343234323");
    }
}
