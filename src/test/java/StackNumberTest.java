import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackNumberTest {
    private StackNumber stackNumber = new StackNumber();

    @Test
    public void test_stackNumber() {
        stackNumber.push(6);
        assertEquals(stackNumber.getAll(), new ArrayList<>(Arrays.asList(6)));
        stackNumber.push(9);
        assertEquals(stackNumber.getAll(), new ArrayList<>(Arrays.asList(6, 9)));
        assertEquals(stackNumber.peek(), 9);
        assertEquals(stackNumber.getAll(), new ArrayList<>(Arrays.asList(6, 9)));
        assertEquals(stackNumber.pop(), 9);
        assertEquals(stackNumber.getAll(), new ArrayList<>(Arrays.asList(6)));
        stackNumber.push(3);
        stackNumber.push(12);
        assertEquals(stackNumber.search(0), -1);
        assertEquals(stackNumber.search(3), 1);
        assertEquals(stackNumber.empty(), false);
    }
}
