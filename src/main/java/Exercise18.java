import java.util.HashMap;

public class Exercise18 {
    public int readRomanNumerals(String romannumerals) {
        int len = romannumerals.length();
        int[] listValue = new int[len];
        for (int i = 0; i < len; i++) {
            switch (romannumerals.charAt(i)) {
                case 'I':
                    listValue[i] = 1;
                    break;
                case 'V':
                    listValue[i] = 5;
                    break;
                case 'X':
                    listValue[i] = 10;
                    break;
                case 'L':
                    listValue[i] = 50;
                    break;
                case 'C':
                    listValue[i] = 100;
                    break;
                case 'D':
                    listValue[i] = 500;
                    break;
                case 'M':
                    listValue[i] = 1000;
                    break;
            }
        }
        int result = listValue[len-1];
        for (int i = len - 1; i > 0; i--) {
            if (listValue[i]>listValue[i-1]){
                result -= listValue[i - 1];
            }else {
                result+=listValue[i-1];
            }
        }
        return result;
    }
}
