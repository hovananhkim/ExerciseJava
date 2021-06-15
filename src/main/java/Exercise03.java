public class Exercise03 {
    public String primeList(int n) {
        String primeList = String.join("");
        int prime = 2;
        if (n == 2) {
            return "2";
        }
        while (n >= prime ) {
            while (n % prime == 0) {
//                primeList += prime + "*";
                String.join(primeList, Integer.toString(prime), "*");
                n /= prime;
            }
            prime++;
        }
        System.out.println(primeList);
        return primeList.substring(0, primeList.length() - 1);
    }
}
