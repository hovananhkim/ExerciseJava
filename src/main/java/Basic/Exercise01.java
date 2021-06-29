package Basic;

public class Exercise01 {
    public int ucln(int a, int b) {
        if (a * b == 0) {
            return a + b;
        }
        if (a > b) {
            return ucln(a % b, b);
        }
        return ucln(a, b % a);
    }

    public int bcnn(int a, int b) {
        return a * b / (ucln(a, b));
    }
}
