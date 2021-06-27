import java.util.LinkedList;
import java.util.Queue;

public class QueueNumber {
    Queue<Number> numberQueue = new LinkedList<>();

    public void add(Number e) {
        numberQueue.add(e);
    }

    public void offer(Number e) {
        numberQueue.offer(e);
    }

    public Number element() {
        return numberQueue.element();
    }

    public Number peek() {
        return numberQueue.peek();
    }

    public void remove() {
        numberQueue.remove();
    }

    public void poll() {
        numberQueue.poll();
    }
}
