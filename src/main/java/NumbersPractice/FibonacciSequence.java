package NumbersPractice;
import java.util.*;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int start =0;
		int second =1;
		for(int i=0;i<n;i++) {
			System.out.print(start+" ");
			int next =start+second;
			start = second;
			second = next;
			//start = second;
		}
		

	}

}
