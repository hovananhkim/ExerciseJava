package Array;

public class Array14 {
    public int determinant(int array[][]) {
        if (array.length == 1) {
            return array[0][0];
        }
        int sum = 0;
        for (int k = 0; k < array.length; k++) {
            int[][] temp = getArrayIgnoreRowAndColZero(array, k);
            if (k % 2 == 0) {
                sum += array[k][0] * determinant(temp);
            } else {
                sum -= array[k][0] * determinant(temp);
            }
        }
        return sum;
    }

    public int[][] getArrayIgnoreRowAndColZero(int[][] array, int row) {
        int[][] result = new int[array.length - 1][array.length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i < row) {
                    result[i][j - 1] = array[i][j];
                } else if (i > row) {
                    result[i - 1][j - 1] = array[i][j];
                }
            }
        }
        return result;
    }
}