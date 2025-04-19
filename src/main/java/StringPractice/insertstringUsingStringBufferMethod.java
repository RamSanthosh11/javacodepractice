package StringPractice;

import java.util.Scanner;

public class insertstringUsingStringBufferMethod {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String stringinsert1 = sc.next();
		int index =sc.nextInt();
		
		StringBuffer str1 = new StringBuffer(str); 
        str1.insert(index + 1, stringinsert1); 
		System.out.println(str1);


}
}
