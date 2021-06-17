import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class String03Test {
    @Test
    public void test_splitNumber(){
        assertEquals(new String03().splitNumber("a 1 f2 30"),33);
    }
}
