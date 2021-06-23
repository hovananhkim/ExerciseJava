public class Array07 {
    public int[] findArrayAscLongest(int[] array) {
        int begin = 0;
        int end = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int left = i;
            while (array[i] <= array[i + 1]) {
                i++;
            }
            int right = i;
            if ((end - begin) < (right - left)) {
                begin = left;
                end = right;
            }
        }
        int[] result = new int[end - begin + 1];
        for (int i = begin; i <= end; i++) {
            result[i - begin] = array[i];
        }
        return result;
    }
}