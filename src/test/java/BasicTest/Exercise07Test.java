package BasicTest;

import Basic.Exercise07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {
    @Test
    public void test_Factorial() {
        assertEquals(new Exercise07().factorial(0), 1);
        assertEquals(new Exercise07().factorial(5), 120);
    }
}
