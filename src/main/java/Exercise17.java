public class Exercise17 {
    public double Sqrt(float n) {
        //Do chinh xac 0.0001
        double left=0,right=n;
        for (int i=0;i<1000;i++){
            double temp = (left+right)/2;
            if (temp*temp>=n) right=temp;
            else left=temp;
        }
        return Math.round(right*10000)/10000.0;
    }
}