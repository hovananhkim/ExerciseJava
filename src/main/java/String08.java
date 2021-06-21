public class String08 {
    public boolean isBarCodeEAN13(String str) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (i % 2 == 0) {
                sumOdd += num;
            } else {
                sumEven += num;
            }
        }
        return (sumOdd + 3 * sumEven) % 10 == 0;
    }
}
