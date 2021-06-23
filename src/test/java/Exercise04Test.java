import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise04Test {
    @Test
    public void test_listFibonacy() {
        assertArrayEquals(new Exercise04().listFibonacci(8), new int[]{1, 1, 2, 3, 5, 8});
    }
}
