import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise20Test {
    @Test
    public void test_happyNumber(){
        assertEquals(new Exercise20().happyNumber(19),true);
        assertEquals(new Exercise20().happyNumber(10),true);
        assertEquals(new Exercise20().happyNumber(17),false);
    }
}
