package StringPractice;

import java.util.Scanner;

public class StringBufferMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//input "hello team welcome to java"
		StringBuffer newstr = new StringBuffer(str);	
		
		newstr.append(" class");
		
		newstr.insert(28,"1");
		
		newstr.replace(0, 5, "Hello0");
		
		newstr.delete(0, 6);
		
		newstr.reverse();
		
		newstr.setCharAt(0, 'a');
		
		char ch = newstr.charAt(1);

				
		
		System.out.println(newstr);
		System.out.println(ch);

	

}
}
