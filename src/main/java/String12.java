import java.util.ArrayList;
import java.util.Collections;

public class String12 {
    public String createMaxNumberFromArray(int[] array) {
        ArrayList<String> listNum = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            listNum.add(Integer.toString(array[i]));
        }
        Collections.sort(listNum, Collections.reverseOrder());
        for (int i = 0; i < listNum.size() - 1; i++) {
            String strLeft = listNum.get(i);
            String strRight = listNum.get(i + 1);
            if (strLeft.startsWith(strRight)) {
                if (addMoreLastCharacterToEqualLength(strRight, strLeft.length()).compareTo(strLeft) > 0) {
                    listNum.set(i, strRight);
                    listNum.set(i + 1, strLeft);
                    if (i > 1) {
                        i -= 2;
                    }
                }
            }
        }
        return String.join("", listNum);
    }

    public String addMoreLastCharacterToEqualLength(String str, int len) {
        StringBuilder result = new StringBuilder(str);
        for (int i = str.length(); i < len; i++) {
            result.append(str.charAt(str.length() - 1));
        }
        return result.toString();
    }
}