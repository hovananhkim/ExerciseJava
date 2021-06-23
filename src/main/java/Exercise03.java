import java.util.ArrayList;

public class Exercise03 {
    public String primeNumberAnalysis(int n) {
        ArrayList<String> primeList = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                primeList.add(Integer.toString(i));
                n = n / i;
            } else {
                i++;
            }
        }
        return String.join("*", primeList);
    }
}
