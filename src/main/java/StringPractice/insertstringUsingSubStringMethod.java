package StringPractice;

import java.util.Scanner;

public class insertstringUsingSubStringMethod {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String stringinsert1 = sc.next();
		int index =sc.nextInt();
        str = str.substring(0, index+1) + stringinsert1 + str.substring(index+1);
		
/*		for(int i =0;i<str.length();i++) {
			if(index==i){
				
		        str = str.substring(0, index) + stringinsert1 + str.substring(index);
		        break;
				
				
			
		}
			//System.out.println(str);
	}
	*/
		System.out.println(str);


}
}
