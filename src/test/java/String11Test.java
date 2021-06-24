import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String11Test {

    @Test
    public void test_subtract() {
        assertEquals(new String11().subtract("1000","999"),"1");
        assertEquals(new String11().subtract("27","19"),"8");
        assertEquals(new String11().subtract("113", "23"), "90");
        assertEquals(new String11().subtract("52", "23"), "29");
        assertEquals(new String11().subtract("11", "23"), "-12");
        assertEquals(new String11().subtract("11", "11"), "0");
        assertEquals(new String11().subtract("141332231", "99"), "141332132");
        assertEquals(new String11().subtract("1", "100"), "-99");
    }
}