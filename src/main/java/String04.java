public class String04 {
    public boolean isLoop(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = str.length() - 1; j > i; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
