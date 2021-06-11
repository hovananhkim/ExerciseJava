public class Exercise09 {
    public double Pi(int n){
        double Pi=3;
        for (int i=1; i<=n;i++){

            Pi+=Math.pow(-1,+i+1)*4/(2*i*(2*i+1)*(2*i+2));
        }
        return Math.round(Pi*100000)/100000.0;
    }
}
