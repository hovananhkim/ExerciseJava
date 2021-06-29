package OOP;

import java.util.ArrayList;

public class QueueNumber {
    private ArrayList<Number> numberQueue = new ArrayList<>();
    private final int size = 5;

    public int size() {
        return numberQueue.size();
    }

    public boolean add(Number e) throws Exception {
        if (size() == size) {
            throw new Exception("Stack over flow");
        }
        numberQueue.add(e);
        return true;
    }

    public boolean offer(Number e) {
        if (size() == size) {
            return false;
        }
        numberQueue.add(e);
        return true;
    }

    public Number element() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        return numberQueue.get(0);
    }

    public Number peek() {
        if (size() == 0) {
            return null;
        }
        return numberQueue.get(0);
    }

    public Number remove() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        Number number = numberQueue.get(0);
        numberQueue.remove(0);
        return number;
    }

    public Number poll() {
        if (size() == 0) {
            return null;
        }
        Number number = numberQueue.get(0);
        numberQueue.remove(0);
        return number;
    }

    public ArrayList<Number> getAll() {
        return numberQueue;
    }
}