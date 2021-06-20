import java.util.ArrayList;
import java.util.Collections;

public class String12 {
    public String createMaxNumberFromArray(int[] array) {
        ArrayList<String> listNum = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            listNum.add(Integer.toString(array[i]));
        }
        Collections.sort(listNum, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listNum.size() - 1; i++) {
            String str1 = listNum.get(i);
            String str2 = listNum.get(i + 1);
            if ((str1.length() > str2.length()) && (compare(str1, str2) < 0)) {
                listNum.set(i, str2);
                listNum.set(i + 1, str1);
                if (i > 1) {
                    i -= 2;
                }
            }
        }
        for (String item : listNum) {
            result.append(item);
        }
        return result.toString();
    }

    public int compare(String str1, String str2) {
        str2 = loop(str2, str1.length());
        return str1.compareTo(str2);
    }

    public String loop(String str, int len) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len / str.length(); i++) {
            result.append(str);
        }
        for (int i = 0; i < len % str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
