package String;

public class String01 {
    public String[] splitSentence(String str) {
        str = str.replaceAll("[.,!,?,\n]", ",");
        String[] result = str.split(",");
        return result;
    }
}
