import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String11Test {
    @Test
    public void test_sub() {
        assertEquals(new String11().sub("113", "23"), "90");
        assertEquals(new String11().sub("141", "23"), "118");
    }
}
