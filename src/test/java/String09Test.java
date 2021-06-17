import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String09Test {
    @Test
    public void findVerifyBarcode() {
        assertEquals(new String09().findVerifyBarcode("938505974194"), 8);
    }
}
