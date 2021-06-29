package BasicTest;

import Basic.Exercise12;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise12Test {
    @Test
    public void test_Sqrt() {
        assertEquals(new Exercise12().sqrt(0), 0, 0.0001);
        assertEquals(new Exercise12().sqrt(9), 3, 0.0001);
        assertEquals(new Exercise12().sqrt(8), 2.82843, 0.0001);
    }
}
