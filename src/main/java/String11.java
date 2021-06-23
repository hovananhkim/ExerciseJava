public class String11 {
    public String sub(String minuend, String subtrahend) {
        if (minuend.equals(subtrahend)) {
            return "0";
        }
        if (minuend.length() > subtrahend.length() || (minuend.length() == subtrahend.length() && minuend.compareTo(subtrahend) > 0)) {
            return subMaxMin(minuend, subtrahend).toString();
        }

        return subMaxMin(subtrahend, minuend).insert(0, "-").toString();
    }

    public int getDigitFromRight(String str, int position) {
        if (str.length() > position) {
            return str.charAt(str.length() - position - 1) - '0';
        }
        return 0;
    }

    public StringBuilder subMaxMin(String max, String min) {
        StringBuilder result = new StringBuilder();
        int memory = 0;
        for (int i = 0; i < max.length(); i++) {
            int currentMinus = getDigitFromRight(max, i) - getDigitFromRight(min, i) - memory;
            memory = 0;
            if (currentMinus < 0) {
                currentMinus += 10;
                memory = 1;
            }
            result.insert(0, currentMinus);
        }
        while (result.toString().startsWith("0")) {
            result.replace(0, 1, "");
        }
        return result;
    }
}