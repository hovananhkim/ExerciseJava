public class Exercise17 {
    public double sqrt(double n) {
        //Do chinh xac 0.0001
        double left = 0;
        double right = n;
        double result = Math.sqrt(n);
        while (result - left >= 0.0001) {
            double temp = (left + right) / 2.0;
            if (temp * temp >= n) right = temp;
            else left = temp;
        }
        return left;
    }
}