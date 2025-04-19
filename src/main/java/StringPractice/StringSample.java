package StringPractice;

import java.util.Scanner;

public class StringSample {
	
	public static void main(String[] args)  {

	Scanner sc = new Scanner(System.in);
	
	//String str =sc.next(); //reads a single word
	
	String str =sc.nextLine();//read the single line of string
	
	//int in = sc.nextInt();
	
	//System.out.println(in);
	String[] words = str.split(" ");
	System.out.println(words);
	System.out.println("the given string..."+str);
	for(int i=0;i<words.length;i++) {
		System.out.println(words[i]);
		
	}

}
}
