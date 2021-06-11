import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise12Test {
    @Test
    public void test_Sqrt(){
        assertEquals(new Exercise12().Sqrt(0),0);
        assertEquals(new Exercise12().Sqrt(8),2.8284);
    }
}
