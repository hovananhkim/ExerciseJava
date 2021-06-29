package Array;

import java.util.ArrayList;
import java.util.Comparator;

public class Array04 {
    public int[] sort(int[] array) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens.add(array[i]);
            } else {
                odds.add(array[i]);
            }
        }
        evens.sort(Comparator.naturalOrder());
        odds.sort(Comparator.reverseOrder());
        evens.addAll(odds);
        for (int i = 0; i < array.length; i++) {
            array[i] = evens.get(i);
        }
        return array;
    }
}
