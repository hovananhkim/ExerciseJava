import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {
    @Test
    public void test_Pi() {
        assertEquals(new Exercise08().Pi(), 3.14159, 0.00001);
    }
}
