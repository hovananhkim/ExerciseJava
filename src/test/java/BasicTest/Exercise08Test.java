package BasicTest;

import Basic.Exercise08;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {
    @Test
    public void test_Pi() {
        assertEquals(new Exercise08().pi(), 3.1416, 0.0001);
    }
}
