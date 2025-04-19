package stringinterviewpractice;
import java.util.*;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		//using temp vriable
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String temp =str1;
		str1 = str2;
		str2=temp;
		System.out.println(str1+" "+str2);
		
		

	}

}
