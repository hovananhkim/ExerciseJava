import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise16Test {
    @Test
    public void test_countFibonacy(){
        assertEquals(new Exercise16().countFibonacy(0),0);
        assertEquals(new Exercise16().countFibonacy(8),6);
    }
}
