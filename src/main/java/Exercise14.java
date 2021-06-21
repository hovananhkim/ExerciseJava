import java.util.Locale;

public class Exercise14 {
    public String isSumxEponentiation() {
        String list = "";
        for (int i = 10; i <= 99999; i++) {
            if (check(i)) {
                list = String.join(" ", list, Integer.toString(i));
            }
        }
        return list.substring(1);
    }

    public boolean check(int n) {
        int m = Integer.toString(n).length();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, m);
            temp /= 10;
        }
        return sum == n;
    }
}
