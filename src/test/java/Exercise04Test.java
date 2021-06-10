import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise04Test {
    @Test
    public void test_listFibonacy(){
        assertEquals(new Exercise04().listFibonacy(8),"1 1 2 3 5 8");
    }
}
