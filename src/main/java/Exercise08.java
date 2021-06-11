public class Exercise08 {
    public double Pi(int n){
        float Pi=0;
        for (int i=0;i<=n;i++){
            Pi +=Math.pow(-1,i)*4/(2*i+1);
        }
        System.out.println(Pi);
        return Math.round(Pi*10000)/10000.0;
    }
}
