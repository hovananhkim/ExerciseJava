public class String03 {
    public int splitNumber(String str) {
        int sum = 0;
        str = str.replaceAll("[^0-9]", ",");
        String[] number = str.split(",");
        for (String num : number) {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}
