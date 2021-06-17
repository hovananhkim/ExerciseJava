public class Exercise08 {
    public double Pi() {
        float Pi = 0;
        double result = Math.PI;
        for (int i = 0; Math.abs(result - Pi) >= 0.0001; i++) {
            Pi += Math.pow(-1, i) * 4 / (2 * i + 1);
        }
        System.out.println(Pi);
        return Double.parseDouble(String.format("%.4f", Pi));
    }
}
