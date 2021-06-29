package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Array10 {
    public int[] insertNumber(int[] array, int x) {
        int[] result = new int[array.length + 1];
        for (int i = 0; true; i++) {
            if (array[i] < x) {
                result[i] = array[i];
                if (i == array.length - 1) {
                    result[i + 1] = x;
                    return result;
                }
            } else {
                result[i] = x;
                for (int j = i; j < array.length; j++) {
                    result[j + 1] = array[j];
                }
                return result;
            }
        }
    }
}
