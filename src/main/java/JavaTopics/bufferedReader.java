package JavaTopics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedReader {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("My name is "+name+" and my age is "+age);
		
	}

}
