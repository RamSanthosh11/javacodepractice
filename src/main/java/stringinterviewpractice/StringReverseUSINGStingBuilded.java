package stringinterviewpractice;
import java.util.*;

public class StringReverseUSINGStingBuilded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		System.out.println(rev);

	}

}
