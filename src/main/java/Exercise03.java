public class Exercise03 {
    public String primeList(int n) {
        int prime = 2;
        String primeList = "";
        if (n == 2) {
            return "2";
        }
        while (n >= prime) {
            while (n % prime == 0) {
                primeList = String.join("*", primeList, Integer.toString(prime));
                n /= prime;
            }
            prime++;
        }
        System.out.println(primeList);
        return primeList.substring(1);
    }
}
