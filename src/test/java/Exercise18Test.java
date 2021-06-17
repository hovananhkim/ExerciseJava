import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise18Test {
    @Test
    public void test_isRomanNumerals(){
        assertEquals(new Exercise18().readRomanNumerals("CXV"),115);
        assertEquals(new Exercise18().readRomanNumerals("MDX"),1510);
        assertEquals(new Exercise18().readRomanNumerals("LI"),51);
        assertEquals(new Exercise18().readRomanNumerals("IX"),9);
        assertEquals(new Exercise18().readRomanNumerals("XX"),20);
    }

}