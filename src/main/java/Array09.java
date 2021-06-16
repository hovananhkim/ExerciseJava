public class Array09 {
    public int findBinary(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (right > left) {
            int midle = (right + left) / 2;
            if (array[midle] > x) {
                right = midle;
            } else if (array[midle] < x) {
                left = midle;
            } else {
                return midle;
            }
        }
        return -1;
    }
}
