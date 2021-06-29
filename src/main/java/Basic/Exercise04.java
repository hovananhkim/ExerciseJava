package Basic;

import java.util.ArrayList;

public class Exercise04 {
    public int[] listFibonacci(int n) {
        ArrayList<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(1);
        listFibonacci.add(1);
        int x = listFibonacci.get(0);
        int y = listFibonacci.get(1);
        while (x + y <= n) {
            listFibonacci.add(x + y);
            x = y;
            y = listFibonacci.get(listFibonacci.size() - 1);
        }
        return listFibonacci.stream().mapToInt(Integer::intValue).toArray();
    }
}
