import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise09 {
    public double Pi(int n) {
        double Pi = 3;
        for (int i = 1; i <= n; i++) {

            Pi += Math.pow(-1, +i + 1) * 4 / (2 * i * (2 * i + 1) * (2 * i + 2));
        }
        NumberFormat formater = new DecimalFormat("#0.00000");
        return Double.parseDouble(formater.format(Pi));
    }
}
