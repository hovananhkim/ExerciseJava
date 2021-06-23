import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String11Test {
    @Test
    public void test_sub() {
        assertEquals(new String11().sub("1000","999"),"1");
        assertEquals(new String11().sub("113", "23"), "90");
        assertEquals(new String11().sub("52", "23"), "29");
        assertEquals(new String11().sub("11", "23"), "-12");
        assertEquals(new String11().sub("11", "11"), "0");
        assertEquals(new String11().sub("141332231", "99"), "141332132");
        assertEquals(new String11().sub("1", "100"), "-99");
    }
}
