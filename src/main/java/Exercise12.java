public class Exercise12 {
    public double Sqrt(double a){
        double fn=a;
        int n=10000;
        if (fn==0) return fn;
        else
            while (n >= 0) {
                fn=a/(2*fn) + fn/2;
                n--;
            }
        return Math.round(fn*10000)/10000.0;
    }
}
