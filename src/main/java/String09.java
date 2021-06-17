public class String09 {
    public int findVerifyBarcode(String str) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {

                sumEven += Character.getNumericValue(str.charAt(i));
            } else {
                sumOdd += Character.getNumericValue(str.charAt(i));
            }
        }
        return 10 - (3 * sumEven + sumOdd) % 10;
    }
}