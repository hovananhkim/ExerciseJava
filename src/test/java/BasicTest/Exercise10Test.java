package BasicTest;

import Basic.Exercise10;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {
    @Test
    public void test_getDayOfWeek() throws ParseException {
        assertEquals(new Exercise10().getDayOfWeek(18, 6, 2021), "Friday");
        assertEquals(new Exercise10().getDayOfWeek(21, 6, 2021), "Monday");
        assertEquals(new Exercise10().getDayOfWeek(28, 2, 2021), "Sunday");
    }
}
