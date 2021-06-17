import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String08Test {
    @Test
    public void test() {
        assertEquals(new String08().isBarCodeEAN13("8938505974194"), true);
        assertEquals(new String08().isBarCodeEAN13("8938505974195"), false);
    }
}
