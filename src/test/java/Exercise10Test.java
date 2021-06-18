import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {
    @Test
    public void test_getDay() {
        assertEquals(new Exercise10().getDay(18, 6, 2021), "Friday");
    }
}
