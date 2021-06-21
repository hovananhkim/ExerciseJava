public class Exercise15 {
    public int binaryReverse(int n) {
        StringBuilder result = new StringBuilder(Integer.toBinaryString(n));
        result = result.reverse();
        return Integer.parseInt(result.toString(), 2);
    }
}