import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise07Test {
    @Test
    public void test_Factorial(){
        assertEquals(new Exercise07().Factorial(0),1);
        assertEquals(new Exercise07().Factorial(5),120);
    }
}
