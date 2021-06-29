package BasicTest;

import Basic.Exercise06;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise06Test {
    @Test
    public void test_getSum(){
        assertEquals(new Exercise06().getSum(5),70);
    }
}
