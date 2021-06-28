import java.util.ArrayList;

public class QueueGeneric<T> {
    private ArrayList<T> genericQueue = new ArrayList<>();
    private final int size = 5;

    public int size() {
        return genericQueue.size();
    }

    public boolean add(T e) throws Exception {
        if (size() == size) {
            throw new Exception("Stack over flow");
        }
        genericQueue.add(e);
        return true;
    }

    public boolean offer(T e) {
        if (size() == size) {
            return false;
        }
        genericQueue.add(e);
        return true;
    }

    public T element() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        return genericQueue.get(0);
    }

    public T peek() {
        if (size() == 0) {
            return null;
        }
        return genericQueue.get(0);
    }

    public T remove() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        T object = genericQueue.get(0);
        genericQueue.remove(0);
        return object;
    }

    public T poll() {
        if (size() == 0) {
            return null;
        }
        T object = genericQueue.get(0);
        genericQueue.remove(0);
        return object;
    }

    public ArrayList<T> getAll() {
        return genericQueue;
    }
}