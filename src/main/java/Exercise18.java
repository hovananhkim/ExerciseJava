import java.util.HashMap;

public class Exercise18 {
    char[] RomanChar = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public int readRomanNumerals(String romannumerals) {
        int result = 0;
        if (isRomanNumerals(romannumerals)) {
            HashMap<Character, Integer> RomantoInt = new HashMap<>();
            RomantoInt.put('I', 1);
            RomantoInt.put('V', 5);
            RomantoInt.put('X', 10);
            RomantoInt.put('L', 50);
            RomantoInt.put('C', 100);
            RomantoInt.put('D', 500);
            RomantoInt.put('M', 1000);
            int len = romannumerals.length();
            int[] valueList = new int[len];
            for (int i = 0; i < len; i++) {
                valueList[i] = RomantoInt.get(romannumerals.charAt(i));
            }
            result = valueList[len - 1];
            for (int i = len - 1; i > 0; i--) {
                if (valueList[i] > valueList[i - 1]) {
                    result = result - valueList[i - 1];
                } else {
                    result += valueList[i - 1];
                }
            }
        }
        return result;
    }

    public boolean isRomanNumerals(String romannumerals) {
        int len = romannumerals.length();
        if (len == 1)
            return isRomanCharacter(romannumerals.charAt(0));
        else if (len > 1) {
            // Kiem tra cac ki tu trong chuoi co chua ki tu khac la ma khong
            for (int i = 0; i < len; i++) {
                if (isRomanCharacter(romannumerals.charAt(i)))
                    continue;
                else return false;
            }
            // Kiem tra lap qua 3 lan khong
            int countI = 0, countX = 0, countC = 0, countM = 0;
            for (int i = 0; i < len; i++) {
                char key = romannumerals.charAt(i);
                if (key == 'I') countI++;
                else if (key == 'X') countX++;
                else if (key == 'C') countC++;
                else if (key == 'M') countM++;
            }
            if (countI > 3 || countC > 3 || countM > 3 || countX > 3)
                return false;
            // Kiem tra so lan xuat hien cac ki tu V L D co lon hon 1 khong
            int countV = 0, countL = 0, countD = 0;
            for (int i = 0; i < len; i++) {
                if (romannumerals.charAt(i) == 'V') {
                    countV++;
                }
                else if (romannumerals.charAt(i) == 'L') {
                    countL++;
                }
                else if (romannumerals.charAt(i) == 'D') {
                    countD++;
                }
            }
            if (countD > 1 || countL > 1 || countV > 1) {
                return false;
            }

            // I chỉ có thể đứng trước V hoặc X, X chỉ có thể đứng trước L hoặc C, C chỉ có thể đứng trước D hoặc M.
            for (int i = 0; i < len - 1; i++) {
                char c1 = romannumerals.charAt(i);
                char c2 = romannumerals.charAt(i + 1);
                if ((c1 == 'I' && !(c2 == 'V' || c2 == 'X' || c2 == 'I'))
                        || (c1 == 'X' && (c2 == 'D' || c2 == 'M'))) {
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isRomanCharacter(char chars) {
        for (int i = 0; i < RomanChar.length; i++) {
            if (RomanChar[i] == chars) {
                return true;
            }
        }
        return false;
    }

}
