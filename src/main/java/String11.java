public class String11 {
    public String sub(String max, String min) {
        int len = max.length();
        min = convert(min, len);
        StringBuilder result = new StringBuilder();
        int sub = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (max.charAt(i) - min.charAt(i) >= sub) {
                result.append(max.charAt(i) - min.charAt(i) - sub);
                sub = 0;
            } else {
                result.append(max.charAt(i) - min.charAt(i) - sub + 10);
                sub = 1;
            }
        }
        result = result.reverse();
        if (result.charAt(0) == '0') {
            return result.substring(1);
        }
        return result.substring(0);
    }

    public String convert(String str, int len) {
        int lenStr = str.length();
        StringBuilder newStr = new StringBuilder(str);
        newStr = newStr.reverse();
        for (int i = lenStr; i < len; i++) {
            newStr = newStr.append(0);
        }
        return newStr.reverse().substring(0);
    }
}
