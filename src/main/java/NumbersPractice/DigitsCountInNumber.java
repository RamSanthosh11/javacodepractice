package NumbersPractice;
import java.util.*;

public class DigitsCountInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		while(n!=0) {
			int digit = n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
