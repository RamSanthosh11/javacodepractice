package ArraysPractice;

public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] array = {4, 9, 10, 5, 3};

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                // Check divisors from 2 to sqrt(num)
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}