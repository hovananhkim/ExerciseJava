import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise19Test {
    @Test
    public void test_writeInttoRoman(){
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(1999),"MCMXCIX");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(555),"DLV");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(444),"CDXLIV");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(111),"CXI");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(1001),"MI");
        assertEquals(new Exercise19().writeNumbertoRomanNumerals(8),"VIII");
    }
}
