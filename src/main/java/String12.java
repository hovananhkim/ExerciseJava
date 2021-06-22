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
            String str1 = listNum.get(i);
            String str2 = listNum.get(i + 1);
            boolean checkChild = false;
            while (isChild(str2, str1)) {
                checkChild = true;
                str1 = str1.replaceFirst(str2, "");
            }
            if (checkChild) {
                while (isChild(str1, str2)) {
                    str2 = str2.replaceFirst(str1, "");
                }
                if (str2.compareTo(str1) > 0) {
                    String temp = listNum.get(i);
                    listNum.set(i, listNum.get(i + 1));
                    listNum.set(i + 1, temp);
                    if (i > 1) {
                        i -= 2;
                    }
                }
            }

        }
        return String.join("", listNum);
    }

    public boolean isChild(String child, String dad) {
        int lenChild = child.length();
        int lenDad = dad.length();
        if (lenChild > lenDad) {
            return false;
        }
        return dad.startsWith(child);
    }
}