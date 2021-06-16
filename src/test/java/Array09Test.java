import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array09Test {
    @Test
    public void test_findBinary() {
        int[] input = {1, 2, 3, 6, 9, 15, 30};
        assertEquals(new Array09().findBinary(input,9),4);
        assertEquals(new Array09().findBinary(input,1),0);
        assertEquals(new Array09().findBinary(input,-2),-1);
    }
}
