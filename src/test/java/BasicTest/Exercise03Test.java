package BasicTest;

import Basic.Exercise03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    @Test
    public void test_listPrime() {
        assertEquals(new Exercise03().primeNumberAnalysis(80), "2*2*2*2*5");
        assertEquals(new Exercise03().primeNumberAnalysis(2), "2");
        assertEquals(new Exercise03().primeNumberAnalysis(3), "3");
        assertEquals(new Exercise03().primeNumberAnalysis(9), "3*3");
        assertEquals(new Exercise03().primeNumberAnalysis(7), "7");
    }
}
