public class String08 {
    public boolean isBarCodeEAN13(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (i % 2 == 0) {
                result += num;
            } else {
                result += num * 3;
            }
        }
        return result % 10 == 0;
    }
}