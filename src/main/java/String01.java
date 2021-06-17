public class String01 {
    public String[] splitSentence(String str) {
        str = str.replaceAll("[.,!,?,\n]", ",");
        String[] result = str.split(",");
        return result;
    }

    public boolean arrayStringEquals(String[] output, String[] result) {

        if (output.length != result.length) {
            return false;
        }
        for (int i = 0; i < output.length; i++) {
            if (!output[i].equals(result[i])) {
                return false;
            }
        }
        return true;
    }
}
