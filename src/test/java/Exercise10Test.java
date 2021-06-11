import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise10Test {
    @Test
    public void test_getDay(){
        assertEquals(new Exercise10().getDay(11,6,2021),"Friday");
        assertEquals(new Exercise10().getDay(11,1,2021),"Monday");
        assertEquals(new Exercise10().getDay(11,2,2020),"Tuesday");
        assertEquals(new Exercise10().getDay(30,2,2020),"");
        assertEquals(new Exercise10().getDay(31,4,2020),"");
        assertEquals(new Exercise10().getDay(32,1,2020),"");
        assertEquals(new Exercise10().getDay(11,2,2021),"Thursday");
        assertEquals(new Exercise10().getDay(29,2,2000),"Tuesday");
        assertEquals(new Exercise10().getDay(31,13,2021),"");
        assertEquals(new Exercise10().getDay(31,6,-1),"");
    }
//    @Test
//    public void test_isDay(){
//        assertEquals(new Exercise10().isDay(32,1,4),false);
//    }
}
