package stringinterviewpractice;
import java.util.*;
public class ConcatinationOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello";
		String str1 = "World";
		String result = str + " " + str1;
		System.out.println(result);
		for(int i=0;i<str1.length();i++) {
			str= str+str1.charAt(i);
		}
		System.out.println(str.concat(str1));
		System.out.println(str);

	}

}
