public class String07 {
    public String decodeShortcutString(String str) {

        return "";
    }

    public String getCharacters(String str) {
        String Characters="";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                    || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                Characters+=str.charAt(i);
            }
        }
        return Characters;
    }
}
