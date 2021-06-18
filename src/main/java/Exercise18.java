import java.util.HashMap;

public class Exercise18 {
    public int readRomanNumerals(String romannumerals) {
        int len = romannumerals.length();
        int[] listValue = new int[len];
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        for (int i = 0; i < len; i++) {
            listValue[i] = romanToInt.get(romannumerals.charAt(i));
        }
        int result = listValue[len - 1];
        for (int i = len - 1; i > 0; i--) {
            if (listValue[i] > listValue[i - 1]) {
                result -= listValue[i - 1];
            } else {
                result += listValue[i - 1];
            }
        }
        return result;
    }
}
