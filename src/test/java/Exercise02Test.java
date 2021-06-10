import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise02Test {
    @Test
    public void test_digSum(){
        assertEquals(new Exercise02().digSum(6),6);
        assertEquals(new Exercise02().digSum(16),7);
    }
}
