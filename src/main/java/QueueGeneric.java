import java.util.ArrayList;

public class QueueGeneric {
    private ArrayList<Object> genericQueue = new ArrayList<>();
    private final int size = 5;

    public int size() {
        return genericQueue.size();
    }

    public boolean add(Object e) throws Exception {
        if (size() == size) {
            throw new Exception("Stack over flow");
        }
        genericQueue.add(e);
        return true;
    }

    public boolean offer(Object e) {
        if (size() == size) {
            return false;
        }
        genericQueue.add(e);
        return true;
    }

    public Object element() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        return genericQueue.get(0);
    }

    public Object peek() {
        if (size() == 0) {
            return null;
        }
        return genericQueue.get(0);
    }

    public Object remove() throws Exception {
        if (size() == 0) {
            throw new Exception("Queue is empty");
        }
        Object object = genericQueue.get(0);
        genericQueue.remove(0);
        return object;
    }

    public Object poll() {
        if (size() == 0) {
            return null;
        }
        Object object = genericQueue.get(0);
        genericQueue.remove(0);
        return object;
    }

    public ArrayList<Object> getAll() {
        return genericQueue;
    }
}