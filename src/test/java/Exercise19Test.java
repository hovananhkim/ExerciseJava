import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise19Test {
    @Test
    public void test_writeNumbertoRomanNumerals(){
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(1000),"M");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(1234),"MCCXXXIV");
    }
}
