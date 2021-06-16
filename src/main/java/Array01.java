import java.util.HashMap;

public class Array01 {
    public String numberRepeatAppear(String listNumber) {
        String result = "";
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
                result = String.join(" ", result, Integer.toString(key));
            }
            System.out.println(frequency.get(key));
        }
        return result.substring(1);
    }
}
