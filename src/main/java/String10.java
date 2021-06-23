public class String10 {
    public String sum(String a, String b) {
        if (a.length() > b.length()) {
            b = padZero(b, a.length());
        } else {
            a = padZero(a, b.length());
        }
        StringBuilder result = new StringBuilder();
        int memory = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = a.charAt(i) + b.charAt(i) + memory - '0' * 2;
            result.append(sum % 10);
            memory = sum / 10;
        }
        if (memory > 0) {
            result.append(memory);
        }
        return result.reverse().toString();
    }

    public String padZero(String str, int expectedLength) {
        return String.format("%" + expectedLength + "s", str).replace(' ', '0');
    }
}