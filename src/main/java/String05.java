import java.util.HashMap;

public class String05 {
    public String findCharacterAppearMoreTwice(String str) {
        HashMap<Character, Integer> frequency = getFrequency(str);
        String result = "";
        for (Character key : frequency.keySet()) {
            if (frequency.get(key) >= 2) {
                result += key;
            }
        }
        System.out.println(result);
        return result;
    }

    public HashMap<Character, Integer> getFrequency(String str) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!frequency.containsKey(str.charAt(i))) {
                    frequency.put(str.charAt(i), 0);
                }
                char key = str.charAt(i);
                int value = frequency.get(key);
                frequency.put(key, value + 1);
            }
        }
        return frequency;
    }
}
