public class Array04 {
    public int[] array04(int[] array) {
        int len = array.length;
        sort(array);
        int count = len - 1;
        int countEvenNumber = countEvenNumber(array);
        for (int i = 0; count>=countEvenNumber ; i++) {
            if (array[i] % 2 != 0) {
                addpend(array, i, count);
                i--;
                count--;
            }
        }
        return array;
    }

    public int countEvenNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] > array[j]) {
                    swapElements(array, i, j);
                }
            }
        }
    }

    public void addpend(int[] array, int x, int y) {
        int temp = array[x];
        for (int i = x; i < y; i++) {
            array[i] = array[i + 1];
        }
        array[y] = temp;
    }

    public void swapElements(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
