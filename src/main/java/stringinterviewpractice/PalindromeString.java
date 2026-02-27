package stringinterviewpractice;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        str = str.toLowerCase();
		String rev ="";
		for(int i =str.length()-1;i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
