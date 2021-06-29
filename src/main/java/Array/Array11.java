package Array;

public class Array11 {
    public int findMaxSum(int[] array) {
        int maxsum = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (maxsum < sum(array, i, j)) {
                    maxsum = sum(array, i, j);
                }
            }
        }
        return maxsum;
    }

    public int sum(int[] array, int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
