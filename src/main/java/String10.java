public class String10 {
    public String sum(String a, String b) {
        if (a.length() > b.length()) {
            b = convertTwoStringEqualLength(b, a.length());
        } else {
            a = convertTwoStringEqualLength(a, b.length());
        }
        StringBuilder result = new StringBuilder();
        int memory = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = a.charAt(i) + b.charAt(i) + memory - '0' * 2;
            if (sum < 10) {
                result.append(sum);
                memory = 0;
            } else {
                result.append(sum % 10);
                memory = sum / 10;
            }
        }
        if (memory > 0) {
            result.append(memory);
        }
        return result.reverse().toString();
    }

    public String convertTwoStringEqualLength(String str, int len) {
        int lenStr = str.length();
        StringBuilder newStr = new StringBuilder(str);
        for (int i = lenStr; i < len; i++) {
            newStr.insert(0, 0);
        }
        return newStr.toString();
    }
}