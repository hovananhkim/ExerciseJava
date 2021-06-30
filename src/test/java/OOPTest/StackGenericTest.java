package OOPTest;

import OOP.StackGeneric;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackGenericTest {
    public static StackGeneric<String> stackGeneric = new StackGeneric<>();

    @BeforeAll
    public static void init() {
        stackGeneric.push("Thu2");
        stackGeneric.push("Thu3");
        stackGeneric.push("Thu4");
    }

    @Test
    public void test_peek() {
        assertEquals(stackGeneric.peek(), "Thu4");
    }

    @Test
    public void test_pop() {
        assertEquals(stackGeneric.pop(), "Thu4");
        assertEquals(stackGeneric.pop(), "Thu3");
    }

    @Test
    public void test_empty() {
        assertFalse(stackGeneric.empty());
    }
}
