package OOP;

import java.util.ArrayList;

public class QueueGeneric<T> {
    private ArrayList<T> numberQueue = new ArrayList<>();

    public void enqueue(T e) {
        numberQueue.add(e);
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        T result = numberQueue.get(0);
        numberQueue.remove(0);
        return result;
    }

    public boolean isEmpty() {
        return numberQueue.isEmpty();
    }
}