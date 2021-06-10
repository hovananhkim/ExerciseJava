public class Exercise14 {
    public int isSumxEponentiation(int n){
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
            System.out.println(sum);
            if (sum>n) break;
        }
        return m;

    }
}
