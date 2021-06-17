import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class String06Test {
    @Test
    public void test_shortcutString(){
        assertEquals(new String06().shortcutString("abbcccd"),"a23d");
        assertEquals(new String06().shortcutString("aaaabbcccd"),"423d");
    }
}
