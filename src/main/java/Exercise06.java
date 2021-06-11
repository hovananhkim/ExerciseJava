public class Exercise06 {
    public int getSum(int n){
        if (n==0) return 0;
        return getSum(n-1)+n*(n+1);
    }
}
