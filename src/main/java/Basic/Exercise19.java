package Basic;

import java.util.HashMap;
import java.util.HashSet;

public class Exercise19 {
    public String writeNumbertoRomanNumerals(int number) {
        String result = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; true ; i++) {
            while (number > values[i]) {
                result += keys[i];
                number -= values[i];
            }
            if (number == values[i]) {
                result += keys[i];
                break;
            }
        }
        return result;
    }
}