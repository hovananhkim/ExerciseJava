package String;

public class String05 {
    public String findCharacterAppearMoreTwice(String str) {
        StringBuilder result = new StringBuilder();
        str = str.replaceAll(" ", "");
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.lastIndexOf(str.charAt(i)) > i && result.indexOf(str.charAt(i) + "") < 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}