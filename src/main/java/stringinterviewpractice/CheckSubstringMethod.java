package stringinterviewpractice;
import java.util.*;

public class CheckSubstringMethod {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String MainString = sc.nextLine();
		 String SubString = sc.nextLine();
		 
		 //Using Contains Method
		 System.out.println(MainString.contains(SubString));
		 
		 //Using Subsring Method
		 int count =0;
		 for(int i =0;i<=MainString.length()-SubString.length();i++) {
			 
			 String compare = MainString.substring(i,i+SubString.length());
			 if(compare.equals(SubString)) {
				 System.out.println(SubString+"  is a substring of "+MainString);
				 count++;
				 break;
			 }
			 
			 
		 }
		 if(count==0) {
			 System.out.println(SubString+"  is not a substring of "+MainString);

			 
		 }
		 

	}

}
