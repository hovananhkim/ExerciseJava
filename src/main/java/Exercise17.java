import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise17 {
    public double Sqrt(float n) {
        //Do chinh xac 0.0001
        double left = 0, right = n;
        for (int i = 0; i < 1000; i++) {
            double temp = (left + right) / 2;
            if (temp * temp >= n) right = temp;
            else left = temp;
        }
        NumberFormat formater = new DecimalFormat("#0.0000");
        return Double.parseDouble(formater.format(right));
    }
}