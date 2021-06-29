package String;

public class String06 {
    public String shortcutString(String str) {
        StringBuilder result = new StringBuilder();
        while (str.length() > 0) {
            char firstChar = str.charAt(0);
            result.append(firstChar);
            int postion = str.lastIndexOf(firstChar);
            int sub = postion + 1;
            if (sub > 1) {
                result.append(sub);
            }
            str = str.replaceAll(firstChar + "", "");
        }
        return result.toString();
    }
}
