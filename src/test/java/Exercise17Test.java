import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise17Test {
    @Test
    public void test_sqrt(){
        assertEquals(new Exercise17().sqrt(9),3,0.0001);
        assertEquals(new Exercise17().sqrt(8),2.8284,0.0001);
    }
}
