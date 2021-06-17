public class String06 {
    public String shortcutString(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                str = deleteCharacter(str,i);
                i--;
            }
        }
        return str;
    }

    public String deleteCharacter(String str, int index) {
        String newString = String.join("", str.substring(0, index), str.substring(index + 1));
        return newString;
    }
}
