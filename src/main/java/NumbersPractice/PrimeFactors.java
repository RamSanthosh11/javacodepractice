package NumbersPractice;
import java.util.*;

public class PrimeFactors {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	
		
        // Check for prime factors starting from 2
        System.out.print("Prime factors of " + n + " are: ");
        
        // Check for divisibility by 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        
        // Check for odd factors from 3 upwards
        for (int i = 3; i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        // If n is still greater than 2, it means n itself is prime
        if (n > 2) {
            System.out.print(n);
        }
        
        sc.close();
    }
}