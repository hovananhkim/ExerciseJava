import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise08 {
    public double Pi(int n) {
        float Pi = 0;
        for (int i = 0; i <= n; i++) {
            Pi += Math.pow(-1, i) * 4 / (2 * i + 1);
        }
        NumberFormat formater = new DecimalFormat("#0.0000");
        return Double.parseDouble(formater.format(Pi));
    }
}
