public class Array15 implements MaxArray {
    @Override
    public int[] findMaxArray(int[] array, int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        for (int i = k; i < array.length; i++) {
            int index = getIndexMinArray(result);
            if (array[i] > result[index]) {
                result[index] = array[i];
            }
        }
        return result;
    }

    public int getIndexMinArray(int[] array) {
        int minIndex= 0;
        for (int j = 1; j < array.length; j++) {
            if (array[minIndex] > array[j]) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}
