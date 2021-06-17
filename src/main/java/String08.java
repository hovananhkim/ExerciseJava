public class String08 {
    public boolean isBarCodeEAN13(String str) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sumOdd += str.charAt(i);
            } else {
                sumEven += str.charAt(i);
            }
        }
        if ((sumOdd+3*sumEven)%10==0){
            return true;
        }
        else {
            return false;
        }
    }
}
