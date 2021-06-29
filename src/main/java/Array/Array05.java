package Array;

public class Array05 {
    public int sumPrime(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
