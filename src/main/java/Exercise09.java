public class Exercise09 {
    public double pi() {
        double Pi = 3;
        double result = Math.PI;
        for (int i = 1; Math.abs(result - Pi) >= 0.0001; i++) {

            Pi += Math.pow(-1, +i + 1) * 4 / (2 * i * (2 * i + 1) * (2 * i + 2));
        }
        return Pi;
    }
}
