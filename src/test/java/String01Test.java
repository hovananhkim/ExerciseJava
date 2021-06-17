import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String01Test {
    @Test
    public void test_splitSentence() {
        String input = "Kim dep trai! Bach Khoa. Da Nang";
        String[] output = {"Kim dep trai", " Bach Khoa", " Da Nang"};
        String[] output2 = {"Kim dep trai", " Bach Khoa", " Da Nang", "xyz"};
        String[] output3 = {"Kim dep trai qua", " Bach Khoa", " Da Nang"};
        String[] result = new String01().splitSentence(input);
        assertEquals(new String01().arrayStringEquals(output, result), true);
        assertEquals(new String01().arrayStringEquals(output2, result), false);
        assertEquals(new String01().arrayStringEquals(output3, result), false);
    }
}
