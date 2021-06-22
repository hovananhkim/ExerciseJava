public class String11 {
    public String sub(String minuend, String subtrahend) {
        if (minuend.equals(subtrahend)) {
            return "0";
        }
        if ((minuend.length() == subtrahend.length()&&minuend.compareTo(subtrahend)>0)||minuend.length() > subtrahend.length()) {
            return subMaxMin(minuend, subtrahend).toString();
        }
        return subMaxMin(subtrahend, minuend).insert(0, "-").toString();
    }

    public String convertEqualLength(String str, int len) {
        int lenStr = str.length();
        StringBuilder newStr = new StringBuilder(str);
        newStr = newStr.reverse();
        for (int i = lenStr; i < len; i++) {
            newStr = newStr.append(0);
        }
        return newStr.reverse().toString();
    }

    public StringBuilder subMaxMin(String minuend, String subtrahend) {
        int lenMinuend = minuend.length();
        subtrahend = convertEqualLength(subtrahend, lenMinuend);
        StringBuilder result = new StringBuilder();
        int memory = 0;
        for (int i = lenMinuend - 1; i >= 0; i--) {
            if (minuend.charAt(i) - subtrahend.charAt(i) >= memory) {
                result.append(minuend.charAt(i) - subtrahend.charAt(i) - memory);
                memory = 0;
            } else {
                result.append(minuend.charAt(i) - subtrahend.charAt(i) - memory + 10);
                memory = 1;
            }
        }
        result.reverse();
        if (result.charAt(0) == '0') {
            return result.delete(0, 1);
        }
        return result;
    }
}