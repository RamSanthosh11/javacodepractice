package StringPractice;

import java.util.Scanner;

public class evenlengthwords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		String[] words = str.split(" ");
		for(int i =0;i<words.length;i++) {
			if(words[i].length()%2 == 0){
					System.out.println(words[i]);
					
			
		}
	}

}
}
