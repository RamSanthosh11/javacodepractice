package JavaTopics;

import java.util.Scanner;

public class DelimiterExample {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner("Java,123,Python,456");
        sc.useDelimiter(",");
        while(sc.hasNext()) {
        	System.out.println(sc.next());
        }

	}

}
