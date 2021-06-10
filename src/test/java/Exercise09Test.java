import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise09Test {
    @Test
    public void test_Pi(){
        assertEquals(new Exercise09().Pi(1000), 3.14159);
    }
}
