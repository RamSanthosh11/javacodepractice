package stringinterviewpractice;
import java.util.*;
public class RemovevowelsString {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String vowels ="aeiouAEIOU";
		for(int i =0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(vowels.indexOf(ch)==-1) {
				System.out.print(ch);
			}
		}
		
	}

}
