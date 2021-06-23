import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array10 {
    public int[] insertNumber(int[] array, int x) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[array.length] = x;
        Arrays.sort(result);
        return result;
    }
}
