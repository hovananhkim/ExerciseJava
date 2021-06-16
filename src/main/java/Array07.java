public class Array07 {
    public int[] findArrayAscLongest(int[] array) {
        int begin = 0;
        int end = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (isArrayAsc(array, i, j)) {
                    if (j - i > end - begin) {
                        begin = i;
                        end = j;
                    }
                }
            }
        }
        int[] result = new int[end - begin + 1];
        for (int i = begin; i <= end; i++) {
            result[i - begin] = array[i];
        }
        return result;
    }

    public boolean isArrayAsc(int[] array, int begin, int end) {
        for (int i = begin; i < end; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
