package OOPTest;

import OOP.QueueGeneric;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueGenericTest {
    public static QueueGeneric<String> queueString = new QueueGeneric<>();

    @BeforeAll
    public static void init() {
        queueString.enqueue("Ho");
        queueString.enqueue("Van");
        queueString.enqueue("Kim");
    }

    @Test
    public void test_dequeue() throws Exception {
        assertEquals("Ho", queueString.dequeue());
        assertEquals("Van", queueString.dequeue());
        assertEquals("Kim", queueString.dequeue());
        assertThrows(Exception.class, () -> {
            queueString.dequeue();
        });
    }

    @Test
    public void test_isEmpty() {
        assertTrue(queueString.isEmpty());
    }
}
