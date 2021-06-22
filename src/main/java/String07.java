public class String07 {
    public String decodeShortcutString(String str) {
        String characters = str.replaceAll("[0-9]", "");
        String count = str.replaceAll("[^0-9]", ",");
        count = count.substring(1);
        if (count.charAt(count.length() - 1) == ',') {
            count += "1";
        }
        String[] listNum = count.split(",");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i].equals("")) {
                result.append(characters.charAt(i));
            } else {
                int loop = Integer.parseInt(listNum[i]);
                for (; loop > 0; loop--) {
                    result.append(characters.charAt(i));
                }
            }
        }
        return result.toString();
    }
}