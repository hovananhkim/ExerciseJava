public class Array14 {
    public int determinant(int array[][], int n) {
        int sum = 0;
        if (n == 1) {
            sum = array[0][0];
        }
        for (int k = 0; k < n; k++) {
            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (i < k) {
                        temp[i][j - 1] = array[i][j];
                    } else if (i > k) {
                        temp[i - 1][j - 1] = array[i][j];
                    }
                }
            }
            if (k % 2 == 0) {
                sum += array[k][0] * determinant(temp, n - 1);
            } else {
                sum -= array[k][0] * determinant(temp, n - 1);
            }

        }
        return sum;
    }
}
