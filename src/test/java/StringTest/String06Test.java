package StringTest;

import String.String06;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String06Test {
    @Test
    public void test_shortcutString() {
        assertEquals(new String06().shortcutString("abbcccd"), "ab2c3d");
        assertEquals(new String06().shortcutString("aaaabbcccd"), "a4b2c3d");
    }
}
