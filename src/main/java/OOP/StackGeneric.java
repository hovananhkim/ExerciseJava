package OOP;

import java.util.ArrayList;

public class StackGeneric<T> {
    private ArrayList<T> genericStack = new ArrayList<>();

    public void push(T e) {
        genericStack.add(e);
    }

    public T pop() {
        T t = genericStack.get(genericStack.size() - 1);
        genericStack.remove(genericStack.size() - 1);
        return t;
    }

    public T peek() {
        return genericStack.get(genericStack.size() - 1);
    }

    public boolean empty() {
        return genericStack.isEmpty();
    }
}
