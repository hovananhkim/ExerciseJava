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
            if (isChild(str2, str1)) {
                if (str2.charAt(0) > str1.charAt(str1.length() - 1)) {
                    listNum.set(i, str2);
                    listNum.set(i + 1, str1);
                    if (i > 1) {
                        i -= 2;
                    }
                }
            }
        }
        return String.join("",listNum);
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