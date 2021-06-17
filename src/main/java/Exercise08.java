public class Exercise08 {
    public double pi() {
        float Pi = 0;
        double result = Math.PI;
        for (int i = 0; Math.abs(result - Pi) >= 0.00001; i++) {
            Pi += Math.pow(-1, i) * 4 / (2 * i + 1);
        }
        return Pi;
    }
}
