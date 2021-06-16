public class Array12 {
    public boolean arrayEquals(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        if (lenA != lenB) {
            return false;
        } else {
            for (int i = 0; i < lenA; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
