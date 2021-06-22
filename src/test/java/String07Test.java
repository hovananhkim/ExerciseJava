import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String07Test {
    @Test
    public void test_decodeShortcutString() {
        assertEquals(new String07().decodeShortcutString("a2bcd2e5"), "aabcddeeeee");
        assertEquals(new String07().decodeShortcutString("a2bcd2e"), "aabcdde");
    }

}
