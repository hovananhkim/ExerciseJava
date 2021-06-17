public class Array13 {
    public int[][] deleteRowCol(int[][] array, int r, int c) {
        int row = array.length;
        int col = array[0].length;
        int[][] result = new int[row - 1][col - 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i < r && j < c) {
                    result[i][j] = array[i][j];
                } else if (i > r && j < c) {
                    result[i - 1][j] = array[i][j];
                } else if (i < r && j > c) {
                    result[i][j - 1] = array[i][j];
                } else if (i > r && j > c) {
                    result[i - 1][j - 1] = array[i][j];
                }
            }
        }
        return result;
    }

    public boolean isEquals(int[][] array1, int[][] array2) {
        int row1 = array1.length;
        int col1 = array1[0].length;
        int row2 = array2.length;
        int col2 = array2[0].length;
        if (row1 != row2 || col1 != col2) {
            return false;
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}