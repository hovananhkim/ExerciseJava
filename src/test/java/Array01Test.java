import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array01Test {
    @Test
    public void test_numberRepeatAppear() {
        assertEquals(new Array01().numberRepeatAppear(new int[]{1, 2, 3, 1, 1, 5, 3}), "1 3");
        assertEquals(new Array01().numberRepeatAppear(new int[]{1, 1}), "1");
    }
}
