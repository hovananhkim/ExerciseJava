package StringTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import String.String05;

public class String05Test {
    @Test
    public void test_findCharacterAppearMoreTwice() {
        assertEquals(new String05().findCharacterAppearMoreTwice("all c d c c a a d b"), "alcd");
        assertEquals(new String05().findCharacterAppearMoreTwice("ac b c d b"), "cb");
    }
}
