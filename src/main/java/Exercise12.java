import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise12 {
    public double Sqrt(double a) {
        double fn = a;
        int n = 10000;
        if (fn == 0) return fn;
        else
            while (n >= 0) {
                fn = a / (2 * fn) + fn / 2;
                n--;
            }
        NumberFormat fomater = new DecimalFormat("#0.0000");
        return Double.parseDouble(fomater.format(fn));
    }
}
