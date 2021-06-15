public class Exercise04 {
    public String listFibonacy(int n) {
        String listFibonacy = "";
        if (n > 0) {
            listFibonacy.join("1 1");
            int x = 1, y = 1, z;
            while (x + y <= n) {
                z = x + y;
                x = y;
                y = z;
                listFibonacy.join(" ", Integer.toString(z));
            }
        }
        return listFibonacy;
    }
}
