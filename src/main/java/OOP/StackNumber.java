package OOP;

import java.util.ArrayList;

public class StackNumber {
    private ArrayList<Number> numberStack = new ArrayList<>();

    public void push(Number e) {
        numberStack.add(e);
    }

    public Number pop() {
        Number num = numberStack.get(numberStack.size() - 1);
        numberStack.remove(numberStack.size() - 1);
        return num;
    }

    public Number peek() {
        return numberStack.get(numberStack.size() - 1);
    }

    public boolean empty() {
        return numberStack.isEmpty();
    }
}