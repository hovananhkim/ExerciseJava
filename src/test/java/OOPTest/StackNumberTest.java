package OOPTest;

import OOP.StackNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackNumberTest {
    private static StackNumber stackNumber = new StackNumber();

    @BeforeAll
    public static void init() {
        stackNumber.push(5);
        stackNumber.push(6);
        stackNumber.push(1);
    }

    @Test
    public void test_peek() {
        assertEquals(stackNumber.peek(),1);
    }

    @Test
    public void test_pop() {
        assertEquals(stackNumber.pop(), 1);
        assertEquals(stackNumber.pop(), 6);
    }

    @Test
    public void test_empty() {
        assertFalse(stackNumber.empty());
    }

}
