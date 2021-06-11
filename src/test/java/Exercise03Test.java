import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise03Test {
    @Test
    public void test_listPrime(){
        assertEquals(new Exercise03().primeList(80),"2*2*2*2*5");
        assertEquals(new Exercise03().primeList(2),"2");
    }
}
