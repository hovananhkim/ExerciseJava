import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array10 {
    public int[] insertNumber(int[] array, int x) {
        int length = array.length;
        array = Arrays.copyOf(array, length+1);
        array[length] = x;
        Arrays.sort(array);
        return array;
    }
}
