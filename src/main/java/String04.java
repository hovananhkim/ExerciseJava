public class String04 {
    public boolean isLoop(String str) {
        for (int step = 1; step <= str.length() / 2; step++) {
            if (isLoop(str.substring(0, step), str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLoop(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenB % lenA != 0) {
            return false;
        }
        for (int i = 0; i < lenB / lenA; i++) {
            String temp = b.substring(i * lenA, (i + 1) * lenA);
            if (!temp.equals(a)) {
                return false;
            }
        }
        return true;
    }
}
