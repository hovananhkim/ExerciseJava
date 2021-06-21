public class Array14 {
    public int determinant(int array[][], int n) {
        int det = 0;
        if (n == 1) {
            det = array[0][0];
        } else {
            for (int k = 0; k < n; k++) {
                int[][] temp = getArrayIgnoreRowAndColZero(array,k);
                if (k % 2 == 0) {
                    det += array[k][0] * determinant(temp, n - 1);
                } else {
                    det -= array[k][0] * determinant(temp, n - 1);
                }
            }
        }
        return det;
    }
    public int[][] getArrayIgnoreRowAndColZero(int [][] array, int row){
        int len = array.length;
        int [][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (i < row) {
                    result[i][j-1] = array[i][j];
                } else if (i > row) {
                    result[i - 1][j-1] = array[i][j];
                }
            }
        }
        return result;
    }
}