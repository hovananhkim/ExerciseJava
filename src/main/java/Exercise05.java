public class Exercise05 {
    public String solveQuadraticEquation(int a, int b, int c){
        String result="";
        double delta = b*b - 4*a*c,root1,root2;

        if (delta<0) result += "complex";
        else if (delta==0){
            double root=(-b)/(2*a);
            result +=Math.round(root*10000)/10000.0;
        }
        else {
            root1=(-b+Math.sqrt(delta))/(2*a);
            root2=(-b-Math.sqrt(delta))/(2*a);
            result +=Math.round(root1*10000)/10000.0+" "+Math.round(root2*10000)/10000.0;
        }
        return result;
    }
}
