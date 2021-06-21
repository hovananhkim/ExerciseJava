import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise14Test {
    @Test
    public void test_isSumxEponentiation() {
        assertEquals(new Exercise14().isSumEponentiation(), "153 370 371 407 1634 8208 9474 54748 92727 93084");
    }
}