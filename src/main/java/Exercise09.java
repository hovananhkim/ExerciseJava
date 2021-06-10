public class Exercise09 {
    public double dau(int index){
        if (index%2==0) return -1;
        else return 1;
    }
    public double Pi(int n){
        double Pi=3;
        for (int i=1; i<=n;i++){

            Pi+=dau(i)*4/(2*i*(2*i+1)*(2*i+2));
        }
        return Pi;
    }
}
