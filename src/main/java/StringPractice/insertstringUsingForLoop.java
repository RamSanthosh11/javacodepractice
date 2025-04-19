package StringPractice;

import java.util.Scanner;

public class insertstringUsingForLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String stringinsert1 = sc.next();
		int index =sc.nextInt();
		String newstr ="";
		
		for(int i=0;i<str.length();i++) {
			if(i==index) {
				newstr=newstr+stringinsert1;
				
			}
			newstr=newstr+str.charAt(i);
		}
		System.out.println(newstr);

}
}
