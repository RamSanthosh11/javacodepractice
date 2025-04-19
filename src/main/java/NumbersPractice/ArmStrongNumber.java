package NumbersPractice;
import java.util.*;

public  class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int original =n;
		int Digits = String.valueOf(n).length();
		int armstrong =0;
		while(n!=0) {
			int digit =n%10;
			armstrong += Math.pow(digit, Digits);
			n=n/10;
			
		}
		
		if(armstrong == original) {
			System.out.println("given number is armstrong number");
		}
		else {
			System.out.println("Given number is not a aramstrong number");
		}
	}

}
