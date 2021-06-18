import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String05Test {
    @Test
    public void test_findCharacterAppearMoreTwice() {
        assertEquals(new String05().findCharacterAppearMoreTwice("all c d c c a a d b"), "acdl");
    }
}
