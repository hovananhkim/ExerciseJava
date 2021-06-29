package String;

public class String09 {
    public int findVerifyBarcode(String str) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sumEven += str.charAt(i) - '0';
            } else {
                sumOdd += str.charAt(i) - '0';
            }
        }
        return 10 - (3 * sumEven + sumOdd) % 10;
    }
}