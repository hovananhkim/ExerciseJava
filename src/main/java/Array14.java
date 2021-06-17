public class Array14 {
    public int determinant(int array[][], int n) {
        int sum = 0;
        int s = 1;
        if (n == 1) {
            sum = array[0][0];
        } else if (n == 2) {
            sum = array[0][0] * array[1][1] - array[0][1] * array[1][0];
        } else {
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
                    s = 1;
                } else {
                    s = -1;
                }
                sum += s * array[k][0] * determinant(temp, n - 1);
            }
        }
        return sum;
    }
}
