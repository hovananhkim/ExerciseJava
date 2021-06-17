public class Array03 {
    public int evenSubOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            } else {
                sum -= array[i];
            }
        }
        return sum;
    }
}
