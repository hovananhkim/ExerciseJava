import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise05Test {
    @Test
    public void test_solveQuadraticEquation(){
        assertEquals(new Exercise05().solveQuadraticEquation(1,-4,3),"3.0000 1.0000");
        assertEquals(new Exercise05().solveQuadraticEquation(1,-2,1),"1.0000");
        assertEquals(new Exercise05().solveQuadraticEquation(1,-2,5),"complex");

    }
}
