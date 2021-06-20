public class String10 {
    public String sum(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            b = convert(b, lenA);
        } else if (lenB > lenA) {
            a = convert(a, lenB);
        }
        StringBuilder result = new StringBuilder();
        char OF = '0';
        for (int i = a.length() - 1; i >= 0; i--) {
            String sum = a.charAt(i) + b.charAt(i) + OF - '0' * 3 + "";
            if (sum.length() == 1) {
                result.append(sum);
                OF ='0';
            }else {
                result.append(sum.charAt(1));
                OF = sum.charAt(0);
            }
        }
        return result.reverse().substring(0);
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
