public class String06 {
    public String shortcutString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                int count = 2;
                str = deleteCharacter(str, i);
                for (int j = i + 1; j < str.length() - 1; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        str = deleteCharacter(str, j);
                        j--;
                        count++;
                    } else {
                        break;
                    }
                }
                str = String.join(Integer.toString(count), str.substring(0, i+1), str.substring(i+1));
            }

        }
        return str;
    }

    public String deleteCharacter(String str, int index) {
        String newString = String.join("", str.substring(0, index), str.substring(index + 1));
        return newString;
    }
}
