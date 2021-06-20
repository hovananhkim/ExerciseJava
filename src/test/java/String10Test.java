import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String10Test {
    @Test
    public void test_sum() {
        assertEquals(new String10().sum("1234567895656666", "20222922"), "1234567915879588");
        assertEquals(new String10().sum("123", "4321"), "4444");
    }
}
