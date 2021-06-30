package String;

public class String06 {
    public String shortcutString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(i);
            result.append(firstChar);
            int lastIndex = str.lastIndexOf(firstChar);
            if (lastIndex > i) {
                result.append(lastIndex - i + 1);
                i = lastIndex;
            }
        }
        return result.toString();
    }
}
