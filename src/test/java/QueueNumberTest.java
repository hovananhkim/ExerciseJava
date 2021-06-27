import org.junit.jupiter.api.Test;

public class QueueNumberTest {
    QueueNumber queueNumber = new QueueNumber();

    @Test
    public void test_queueNumber() {
        queueNumber.add(1);
        queueNumber.offer(3);
        queueNumber.element();
        queueNumber.peek();
        queueNumber.poll();
        queueNumber.remove();

    }
}
