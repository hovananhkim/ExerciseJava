package Array;

public class Array08 {
    public int maxSub(int[] array) {
        int max = Math.abs(array[0] - array[1]);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int sub = Math.abs(array[i] - array[j]);
                if (sub > max) {
                    max = sub;
                }
            }
        }
        return max;
    }
    public int minSub(int[] array) {
        int min = Math.abs(array[0] - array[1]);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int sub = Math.abs(array[i] - array[j]);
                if (sub < min) {
                    min = sub;
                }
            }
        }
        return min;
    }
}
