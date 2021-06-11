public class Exercise20 {
    public int happyNumber(int n) {
        int loop = 100;
        while (loop > 0) {
            int temp = n;
            int sum = 0;
            while (temp > 0) {
                sum += (temp % 10) * (temp % 10);
                temp /= 10;
            }
            n = sum;
            if (n == 1) return n;
            loop--;
        }
        return 0;
    }
}
