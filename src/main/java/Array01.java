import java.util.ArrayList;
import java.util.HashMap;

public class Array01 {
    public ArrayList<Integer> numberRepeatAppear(String listNumber) {
        ArrayList<Integer> result = new ArrayList<>();
        String[] input = listNumber.split("\\s");
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (String number : input) {
            int num = Integer.parseInt(number);
            if (!frequency.containsKey(num)) {
                frequency.put(num, 0);
            }
            frequency.put(num, frequency.get(num) + 1);
        }
        for (Integer key : frequency.keySet()) {
            if (frequency.get(key) >= 2) {
                result.add(key);
            }
        }
        return result;
    }
}
