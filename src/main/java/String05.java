public class String05 {
    public String findCharacterAppearMoreTwice(String str) {
        StringBuilder result = new StringBuilder();
        str = str.replaceAll(" ", "");
        while (str.length() > 1) {
            if (str.lastIndexOf(str.charAt(0)) > 0) {
                result.append(str.charAt(0));
            }
            str = str.replaceAll(str.charAt(0) + "", "");
        }
        return result.toString();
    }
}