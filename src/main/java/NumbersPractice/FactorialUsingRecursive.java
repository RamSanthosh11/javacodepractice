package NumbersPractice;
import java.util.*;

public class FactorialUsingRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(factorial(n));

	}
	public static long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
