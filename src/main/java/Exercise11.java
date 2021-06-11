import java.time.Month;
import java.util.HashMap;

public class Exercise11 {
    public String getMonth(int n){
        HashMap<Integer,String> month = new HashMap<>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"Sepember");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");
        return month.get(n);
    }

}
