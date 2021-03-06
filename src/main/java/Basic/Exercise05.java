package Basic;

public class Exercise05 {
    public String solveQuadraticEquation(int a, int b, int c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "complex";
        }
        if (delta == 0) {
            double root = (-b) / (2 * a);
            return String.format("%.4f", root);
        }
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return String.format("%.4f %.4f", root1, root2);

    }
}
