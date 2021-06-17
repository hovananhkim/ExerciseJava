public class Exercise09 {
    public double Pi() {
        double Pi = 3;
        double result = Math.PI;
        for (int i = 1; Math.abs(result - Pi) > 0.00001; i++) {

            Pi += Math.pow(-1, +i + 1) * 4 / (2 * i * (2 * i + 1) * (2 * i + 2));
        }
        return Double.parseDouble(String.format("%.5f", Pi));
    }
}
