import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array01Test {
    @Test
    public void test_numberRepeatAppear() {
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1,3));
        assertEquals(new Array01().numberRepeatAppear("1 2 1 3 5 3").equals(output), true);
    }
}
