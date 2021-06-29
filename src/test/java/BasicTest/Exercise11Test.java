package BasicTest;

import Basic.Exercise11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise11Test {
    @Test
    public void test_getMonth(){
        assertEquals(new Exercise11().getMonth(6),"June");
    }
}
