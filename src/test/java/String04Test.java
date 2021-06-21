import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class String04Test {
    @Test
    public void test_isLoop(){
        assertEquals(new String04().isLoop("abc"), false);
        assertEquals(new String04().isLoop("abab"), true);
        assertEquals(new String04().isLoop("abcabc"), true);
        assertEquals(new String04().isLoop("aaaaa"), true);
        assertEquals(new String04().isLoop("abcdabcdabcd"), true);
        assertEquals(new String04().isLoop("ababababab"), true);
        assertEquals(new String04().isLoop("ababadbabab"), false);
        assertEquals(new String04().isLoop("abababababc"), false);
    }
}
