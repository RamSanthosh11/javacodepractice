package stringinterviewpractice;
import java.util.*;
/*
ramu3317@gmail.com-input
output:
12
4
2
*/
public class CountDigittsandCharacterM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int characterCount=0;
		int numericcount= 0;
		int specialcount=0;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isLetter(c)) {
				characterCount++;
				
			}
			else if(Character.isDigit(c)){
				numericcount++;				
			}
			else {
				specialcount++;
			}
		}
		System.out.println(characterCount);
		System.out.println(numericcount);
		System.out.println(specialcount);



	}

}


