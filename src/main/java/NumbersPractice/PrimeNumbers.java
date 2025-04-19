package NumbersPractice;
import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int count =0;
		
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					count = count+1;
					break;
				}
			}
			System.out.println(count);
			if (n>1 && count==0) {
				System.out.println("prime number");
		}
			else {
				System.out.println("not a prime");
			}
		
		

	}

}
