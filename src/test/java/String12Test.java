import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String12Test {
    @Test
    public void test_createMaxNumberFormArray() {
        int[] input = {2, 3, 6, 21, 32, 34, 210};
        assertEquals(new String12().createMaxNumberFromArray(input), "634332221210");
    }
}