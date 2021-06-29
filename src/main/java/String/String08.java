package String;

public class String08 {
    public boolean isBarCodeEAN13(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += (str.charAt(i) - '0') * ((i % 2 * 2 + 1));
        }
        return result % 10 == 0;
    }
}