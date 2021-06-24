public class String10 {
    public String sum(String a, String b) {

        StringBuilder result = new StringBuilder();
        int memory = 0;
        int length = a.length();
        if (length < b.length()) {
            length = b.length();
        }
        for (int i = 0; i < length; i++) {
            int sum = getDigitFromRight(a, i) + getDigitFromRight(b, i) + memory;
            result.append(sum % 10);
            memory = sum / 10;
        }
        if (memory > 0) {
            result.append(memory);
        }
        return removeZeroPadding(result.reverse().toString());
    }

    private int getDigitFromRight(String str, int position) {
        if (str.length() > position) {
            return str.charAt(str.length() - position - 1) - '0';
        }
        return 0;
    }

    private String removeZeroPadding(String str) {
        int foundIndex = 0;
        while (foundIndex < str.length() - 1 && str.charAt(foundIndex) == '0') {
            foundIndex++;
        }
        return str.substring(foundIndex);
    }
}