import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class String04Test {
    @Test
    public void test_isLoop(){
        assertEquals(new String04().isLoop("abc"),false);
        assertEquals(new String04().isLoop("ababc"),true);
    }
}