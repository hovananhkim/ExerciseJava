public class Exercise20 {
    public boolean happyNumber(int n) {
        int x = n;
        int y = convert(n);
        while (x != y) {
            x=convert(x);
            y=convert(convert(y));
        }
        if (x==1){
            return true;
        }
        return false;
    }
    public int convert(int x) {
        int sum = 0;
        while (x > 0) {
            sum += (x % 10) * (x % 10);
            x /= 10;
        }
        return sum;
    }
}