public class Exercise08 {
    public double pi() {
        double pi = 0;
        int n = 0;
        double esp = 1;
        while (esp > 0.0001) {
            esp = 4.0 / (2 * n + 1);
            pi += Math.pow(-1, n) * esp;
            n++;
        }
        return pi;
    }
}
