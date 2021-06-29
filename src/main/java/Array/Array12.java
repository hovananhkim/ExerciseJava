package Array;

import java.util.ArrayList;

public class Array12 {
    public boolean arrayEquals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                check.add(i);
            }
        }
        if (check.size() == 1 || check.size() > 2) {
            return false;
        }
        if (check.size() == 0) {
            return true;
        }
        return a[check.get(0)] == b[check.get(1)] & a[check.get(1)] == b[check.get(0)];
    }
}