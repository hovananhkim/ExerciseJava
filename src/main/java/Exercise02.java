public class Exercise02 {
    public int digSum(int n){
        if (n < 10) return n;
        return digSum(n/10)+n%10;
    }
}
