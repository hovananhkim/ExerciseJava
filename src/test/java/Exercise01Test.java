import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise01Test {
    @Test
    public void test_ucln(){
        assertEquals(new Exercise01().ucln(6,9),3);
    }
    @Test
    public void test_bcnn(){
        assertEquals(new Exercise01().bcnn(16,6),48);
    }
}
