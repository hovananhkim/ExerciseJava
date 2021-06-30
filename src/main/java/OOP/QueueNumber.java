package OOP;

import java.util.ArrayList;

public class QueueNumber {
    private ArrayList<Number> numberQueue = new ArrayList<>();

    public void enqueue(Number e) {
        numberQueue.add(e);
    }

    public Number dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        Number result = numberQueue.get(0);
        numberQueue.remove(0);
        return result;
    }

    public boolean isEmpty() {
        return numberQueue.isEmpty();
    }
}