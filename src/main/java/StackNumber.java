import java.util.Stack;

public class StackNumber {
    Stack<Number> numberStack = new Stack<>();
    public void push(Number item){
        numberStack.push(item);
    }
    public Number pop(){
        return numberStack.pop();
    }
    public Number peek(){
        return numberStack.peek();
    }
    public int search(Number item){
        return numberStack.search(item);
    }
    public boolean empty(){
        return numberStack.empty();
    }

}
