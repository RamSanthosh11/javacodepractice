package NumbersPractice;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fin = 1;
		for(int i =1;i<=n;i++) {
			fin = fin*i;
		}
		System.out.print(fin);

	}

}
