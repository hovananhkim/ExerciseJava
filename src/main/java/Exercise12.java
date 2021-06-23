public class Exercise12 {
    public double sqrt(double a) {
        double fn = a;
        while (Math.abs(fn * fn - a) >= 0.0001) {
            fn = a / (2 * fn) + fn / 2;
        }
        return fn;
    }
}
