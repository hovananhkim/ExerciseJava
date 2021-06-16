import java.util.Arrays;

public class Array10 {
    public int[] addNumber(int[] array, int x) {
        array = Arrays.copyOf(array, array.length + 1);
        int i = 0;
        while (array[i] < x) {
            i++;
        }
        for (int j = array.length - 1; j > i ; j--) {
            array[j] = array[j - 1];
        }
        array[i] = x;
        return array;
    }
}
