import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackGenericTest {
    private StackGeneric stackGeneric = new StackGeneric();

    @Test
    public void test_stackGeneric() {
        stackGeneric.push("p");
        assertEquals(stackGeneric.peek(), "p");
        stackGeneric.push(1);
        stackGeneric.push('t');
        assertEquals(stackGeneric.pop(), 't');
        assertEquals(stackGeneric.getAll(), new ArrayList<>(Arrays.asList("p", 1)));
        assertEquals(stackGeneric.empty(),false);
        assertEquals(stackGeneric.search("p"),1);
        assertEquals(stackGeneric.search("pa"),-1);
    }
}
