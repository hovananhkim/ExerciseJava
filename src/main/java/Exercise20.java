public class Exercise20 {
    public boolean happyNumber(int n) {
        for (int loop = 100; loop > 0; loop--) {
            int temp = n;
            int sum = 0;
            while (temp > 0) {
                sum += (temp % 10) * (temp % 10);
                temp /= 10;
            }
            n = sum;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}