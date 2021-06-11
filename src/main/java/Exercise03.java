public class Exercise03 {
    public String primeList(int n){
        String primeList="";
        int prime=2;
        if (n==2) return "2";
        while(n>=prime){
            while(n%prime==0){
                primeList+=prime+"*";
                n/=prime;
            }
            prime++;
        }

        return primeList.substring(0,primeList.length()-1);
    }
}
