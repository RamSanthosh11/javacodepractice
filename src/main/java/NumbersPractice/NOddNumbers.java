package NumbersPractice;
import java.util.*;

public class NOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		

	}

}
