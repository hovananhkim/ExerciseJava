public class Exercise15 {
    public int binaryReverse(int n) {
        int result = 0;
        String binary = "";
        while (n > 0) {
            binary += n % 2;
            n /= 2;
        }
        for (int i = 0; i < binary.length(); i++) {
            result += Character.getNumericValue(binary.charAt(i)) * Math.pow(2, binary.length() - 1 - i);
        }
        return result;
    }
}