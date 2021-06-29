package Array;

public class Array02 {
    public int maxSumThreeNumber(int[] array) {
        int x = array[0];
        int y = array[1];
        int z = array[2];
        for (int i = 3; i < array.length; i++) {
            if (x < y && x < z && x < array[i]) {
                x = array[i];
            }
            else if (y < z && y < array[i]) {
                y = array[i];
            }
            else if (z < array[i]) {
                z = array[i];
            }
        }
        return x + y + z;
    }
}
