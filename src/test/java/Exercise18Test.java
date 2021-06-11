import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise18Test {
    @Test
    public void test_isRomanNumerals(){
        assertEquals(new Exercise18().readRomanNumerals("MMMDCCCLXXXVIII"),3888);
        assertEquals(new Exercise18().readRomanNumerals("MMMDCCCLXXXIV"),3884);
        assertEquals(new Exercise18().readRomanNumerals("MMMM"),0);
        assertEquals(new Exercise18().readRomanNumerals("IM"),0);
        assertEquals(new Exercise18().readRomanNumerals("AM"),0);
        assertEquals(new Exercise18().readRomanNumerals("VVM"),0);
        assertEquals(new Exercise18().readRomanNumerals("M"),1000);
        assertEquals(new Exercise18().readRomanNumerals(""),0);
    }
}
