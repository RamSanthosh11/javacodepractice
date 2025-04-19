package stringinterviewpractice;
import java.util.*;
public class FirstLettertoUpperInString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] stra =str.split(" ");
		String NewStr ="";
		for(int i=0;i<stra.length;i++) {
			String temp = stra[i];
			char firl = temp.charAt(0);
			NewStr = NewStr+Character.toUpperCase(firl)+temp.substring(1)+" ";
		}
		System.out.println(NewStr);
		
	}

}
