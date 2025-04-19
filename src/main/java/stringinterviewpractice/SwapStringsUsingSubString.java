package stringinterviewpractice;
import java.util.*;

public class SwapStringsUsingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 =str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swaping two strings  "+str1+" "+str2);
		

	}

}
