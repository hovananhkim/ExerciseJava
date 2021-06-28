import java.util.ArrayList;

public class StackGeneric {
    private ArrayList<Object> genericStack = new ArrayList<>();

    public void push(Object e) {
        genericStack.add(e);
    }

    public Object pop() {
        Object num = genericStack.get(genericStack.size() - 1);
        genericStack.remove(genericStack.size() - 1);
        return num;
    }

    public Object peek() {
        return genericStack.get(genericStack.size() - 1);
    }

    public int search(Object e) {
        if (genericStack.lastIndexOf(e) >= 0) {
            return genericStack.size() - genericStack.lastIndexOf(e) - 1;
        }
        return -1;
    }

    public boolean empty() {
        return genericStack.isEmpty();
    }

    public ArrayList<Object> getAll() {
        return genericStack;
    }
}
