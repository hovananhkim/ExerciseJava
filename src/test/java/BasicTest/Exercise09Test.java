package BasicTest;

import Basic.Exercise09;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise09Test {
    @Test
    public void test_pi() {
        assertEquals(new Exercise09().pi(), 3.14159, 0.00001);
    }
}