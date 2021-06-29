package StringTest;

import org.junit.jupiter.api.Test;
import String.String01;

import static org.junit.jupiter.api.Assertions.*;

public class String01Test {
    @Test
    public void test_splitSentence() {
        String input = "Kim dep trai! Bach Khoa. Da Nang";
        String[] output = {"Kim dep trai", " Bach Khoa", " Da Nang"};
        assertArrayEquals(new String01().splitSentence(input), output);
    }
}