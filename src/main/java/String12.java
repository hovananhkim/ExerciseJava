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
            String numLeft = listNum.get(i);
            String numRight = listNum.get(i + 1);
            if (numLeft.startsWith(numRight)) {
                if ((numRight + numLeft).compareTo(numLeft + numRight) > 0) {
                    listNum.set(i, numRight);
                    listNum.set(i + 1, numLeft);
                    if (i > 1) {
                        i -= 2;
                    }
                }
            }
        }
        return String.join("", listNum);
    }
}