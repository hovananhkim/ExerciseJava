public class Exercise16 {
    public int countFibonacy(int n) {
        int count = 0;
        if (n > 0) {
            count = 2;
            int x = 1, y = 1, z;
            while (x + y <= n) {
                count++;
                z = x + y;
                x = y;
                y = z;
            }
        }
        return count;
    }
}
