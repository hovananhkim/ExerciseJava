import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array05Test {
    @Test
    public void test_sumPrime() {
        int[] input = {1, 6, 9, 16, 3, 2, 5, 8, 20};
        assertEquals(new Array05().sumPrime(input), 10);
    }
}
