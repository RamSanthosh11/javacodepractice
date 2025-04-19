package stringinterviewpractice;
import java.util.*;

public class AnagramUsingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char [] str1a = str1.toCharArray();
		char [] str2a = str2.toCharArray();
		
		Arrays.sort(str1a);
		Arrays.sort(str2a);
		
		if (Arrays.equals(str1a, str2a)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

		
		

	}

}
