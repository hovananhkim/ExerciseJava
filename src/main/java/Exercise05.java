public class Exercise05 {
    public String solveQuadraticEquation(int a, int b, int c) {
        String result = "";
        double delta = b * b - 4 * a * c;
        double root1;
        double root2;

        if (delta < 0) {
            result += "complex";
        } else if (delta == 0) {
            double root = (-b) / (2 * a);
            result = String.format("%.4f", root);
        } else {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            result = String.format("%.4f %.4f", root1, root2);
        }
        return result;
    }
}
