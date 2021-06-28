import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueNumberTest {
    QueueNumber queueNumber = new QueueNumber();

    @Test
    public void test_queueNumber() throws Exception {
        assertEquals(queueNumber.peek(),null);
        assertEquals(queueNumber.poll(),null);
        queueNumber.add(3);
        queueNumber.add(6);
        queueNumber.add(10);
        assertEquals(queueNumber.getAll(), new ArrayList<>(Arrays.asList(3, 6, 10)));
        queueNumber.offer(13);
        assertEquals(queueNumber.getAll(), new ArrayList<>(Arrays.asList(3, 6, 10, 13)));
        assertEquals(queueNumber.element(),3);
        assertEquals(queueNumber.offer(6),true);
        assertEquals(queueNumber.peek(),3);
        assertEquals(queueNumber.remove(),3);
        queueNumber.poll();
    }
}
