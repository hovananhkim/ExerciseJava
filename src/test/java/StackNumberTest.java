import org.junit.jupiter.api.Test;

public class StackNumberTest {
    StackNumber stackNumber = new StackNumber();
    @Test
    public void test_stackNumber(){
        stackNumber.push(5);
        stackNumber.push(6);
        stackNumber.push(9);
        stackNumber.pop();
        stackNumber.peek();
        stackNumber.search(5);
        stackNumber.empty();
    }

}
