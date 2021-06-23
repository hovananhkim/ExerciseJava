import java.util.Arrays;

public class Array15 implements MaxArray {
    @Override
    public int[] findMaxArray(int[] array, int k) {
        Arrays.sort(array);
        return Arrays.copyOfRange(array,array.length-k,array.length);
    }
}
