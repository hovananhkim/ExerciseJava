import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String02Test {
    @Test
    public void test_isSymmetrical() {
        assertEquals(new String02().isSymmetrical("avaa"), false);
        assertEquals(new String02().isSymmetrical("aavaa"), true);
    }
}
