package NumbersPractice;
import java.util.*;

public class ProductOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int product =1;
		while(n!=0) {
			int digit =n%10;
			product = product*digit;
			n=n/10;
		}
		System.out.println(product);

	}

}
