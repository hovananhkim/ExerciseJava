public class Exercise09 {
    public double pi() {
        double pi = 3;
        int i = 1;
        double esp = 1;
        while (esp > 0.00001) {
            esp = 4.0 / (2 * i * (2 * i + 1) * (2 * i + 2));
            pi += Math.pow(-1, i + 1) * esp;
            i++;
        }
        return pi;
    }
}
