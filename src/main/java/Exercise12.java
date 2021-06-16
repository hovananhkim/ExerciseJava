public class Exercise12 {
    public double sqrt(double a) {
        double fn = a;
        int n = 1000000;
        if (fn == 0) {
            return fn;
        } else
            for (int i = 0; i < n; i++) {
                fn = a / (2 * fn) + fn / 2;
                n--;
            }
        return fn;
    }
}
