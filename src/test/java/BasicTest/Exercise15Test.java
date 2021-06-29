package BasicTest;

import Basic.Exercise15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise15Test {
    @Test
    public void test_binaryReserve() {
        assertEquals(new Exercise15().binaryReverse(8), 1);
        assertEquals(new Exercise15().binaryReverse(23), 29);
    }
}
