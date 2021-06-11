public class Exercise14 {
    public int isSumEponentiation(int n){
        int m=0;
        for (int i=2;i<=5;i++){
            int sum = 0;
            int temp = n;
            while (temp>0){
                sum += (int)Math.pow(temp%10, i);
                temp /= 10;
            }
            if (sum == n) {
                m=i;
                break;
            }
        }
        return m;

    }
}
