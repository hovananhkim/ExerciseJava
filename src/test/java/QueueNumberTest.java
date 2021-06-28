import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QueueNumberTest {
    QueueNumber queueNumber = new QueueNumber();

    @Test
    public void test_queueNumber() throws Exception {
        assertEquals(queueNumber.peek(), null);
        assertThrows(Exception.class, () -> {
            queueNumber.element();
        });
        assertThrows(Exception.class, () -> {
            queueNumber.remove();
        });
        assertEquals(queueNumber.poll(), null);
        queueNumber.add(3);
        queueNumber.add(6);
        queueNumber.add(10);
        assertEquals(queueNumber.getAll(), new ArrayList<>(Arrays.asList(3, 6, 10)));
        queueNumber.offer(13);
        queueNumber.add(6);
        assertThrows(Exception.class, () -> {
            queueNumber.add(5);
        });
        assertEquals(queueNumber.getAll(), new ArrayList<>(Arrays.asList(3, 6, 10, 13, 6)));
        assertEquals(queueNumber.element(), 3);

        assertEquals(queueNumber.offer(6), false);
        assertEquals(queueNumber.peek(), 3);
        assertEquals(queueNumber.remove(), 3);
        queueNumber.poll();
        assertEquals(queueNumber.getAll(), new ArrayList<>(Arrays.asList(10, 13, 6)));
    }
}
