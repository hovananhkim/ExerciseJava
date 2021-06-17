public class Exercise12 {
    public double sqrt(double a) {
        double fn = a;
        double result = Math.sqrt(a);
        if (fn == 0) {
            return fn;
        } else
            for (int i = 0; Math.abs(result-fn)>=0.00001; i++) {
                fn = a / (2 * fn) + fn / 2;
            }
        return fn;
    }
}
