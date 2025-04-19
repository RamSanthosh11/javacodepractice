package NumbersPractice;
import java.util.*;

public  class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int original =n;
		int Digits = String.valueOf(n).length();
		int reverse =0;
		while(n!=0) {
			int digit =n%10;
			reverse = reverse*10+digit;
			n=n/10;
			
		}
		
		if(reverse == original) {
			System.out.println("given number is palindrome number");
		}
		else {
			System.out.println("Given number is not a palindrome number");
		}
	}

}
