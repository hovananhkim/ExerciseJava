public class Array14 {
    public int determinant(int array[][]) {
        int det = 0;
        int n = array.length;
        if (n == 1) {
            return array[0][0];
        }
        for (int k = 0; k < n; k++) {
            int[][] temp = getArrayIgnoreRowAndColZero(array, k);
            if (k % 2 == 0) {
                det += array[k][0] * determinant(temp);
            } else {
                det -= array[k][0] * determinant(temp);
            }
        }
        return det;
    }

    public int[][] getArrayIgnoreRowAndColZero(int[][] array, int row) {
        int len = array.length;
        int[][] result = new int[len - 1][len - 1];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
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