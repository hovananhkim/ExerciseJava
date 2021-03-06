package Basic;

public class Exercise17 {
    public double sqrt(double n) {
        double left = 0;
        double right = n;
        while (Math.abs(left * left - n) > 0.0001) {
            double temp = (left + right) / 2.0;
            if (temp * temp >= n) {
                right = temp;
            } else {
                left = temp;
            }
        }
        return left;
    }
}