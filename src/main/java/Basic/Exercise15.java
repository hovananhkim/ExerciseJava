package Basic;

public class Exercise15 {
    public int binaryReverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev <<= 1;
            rev |= n & 1;
            n >>= 1;
        }
        return rev;
    }
}