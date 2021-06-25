import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array10 {
    public int[] insertNumber(int[] array, int x) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[array.length] = x;
        Arrays.sort(result);
        return result;
    }
}
