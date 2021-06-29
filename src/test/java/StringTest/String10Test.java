package StringTest;

import String.String10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String10Test {
    @Test
    public void test_sum() {
        assertEquals(new String10().sum("1234567895656666", "20222922"), "1234567915879588");
        assertEquals(new String10().sum("123", "4321"), "4444");
        assertEquals(new String10().sum("999", "1"), "1000");
        assertEquals(new String10().sum("009", "1"), "10");
        assertEquals(new String10().sum("00", "1"), "1");
        assertEquals(new String10().sum("999", "999"), "1998");
    }
}
