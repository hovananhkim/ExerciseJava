import java.util.HashMap;

public class String05 {
    public String findCharacterAppearMoreTwice(String str) {
        HashMap<Character, Integer> frequency = getFrequency(str);
        StringBuilder result = new StringBuilder();
        for (Character key : frequency.keySet()) {
            if (frequency.get(key) >= 2) {
                result.append(key);
            }
        }
        return result.substring(0);
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
