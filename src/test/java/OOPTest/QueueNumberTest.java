package OOPTest;

import OOP.QueueNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QueueNumberTest {
    public static QueueNumber queueNumber = new QueueNumber();
    
    @BeforeAll
    public static void init() {
        queueNumber.enqueue(1);
        queueNumber.enqueue(12);
        queueNumber.enqueue(16);
    }

    @Test
    public void test_dequeue() throws Exception {
        assertEquals(queueNumber.dequeue(), 1);
        assertEquals(12, queueNumber.dequeue());
        assertEquals(16, queueNumber.dequeue());
        assertThrows(Exception.class, () -> {
            queueNumber.dequeue();
        });
    }
    @Test
    public void test_isEmpty(){
        assertTrue(queueNumber.isEmpty());
    }
}
