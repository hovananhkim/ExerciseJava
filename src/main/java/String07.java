public class String07 {
    public String decodeShortcutString(String str) {
        String Characters = str.replaceAll("[0-9]", "");
        String Nums = str.replaceAll("[^0-9]", ",");
        Nums = Nums.substring(1);
        if (Nums.charAt(Nums.length() - 1) == ',') {
            Nums += "1";
        }
        String[] listNum = Nums.split(",");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i].equals("")) {
                result.append(Characters.charAt(i));
            } else {
                int loop = Integer.parseInt(listNum[i]);
                for (; loop > 0; loop--) {
                    result.append(Characters.charAt(i));
                }
            }
        }
        System.out.println(result);
        return result.substring(0);
    }
}
