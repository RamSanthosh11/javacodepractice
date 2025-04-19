package NumbersPractice;
import java.util.*;

public class CountOfODDNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				count++;
			}
		}
		System.out.println(count);

	}

}
