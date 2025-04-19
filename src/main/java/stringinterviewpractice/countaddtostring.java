package stringinterviewpractice;
import java.util.*;

public class countaddtostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ramm";
		String newstr = "";
		for(int i =0;i<str.length();i++) {
			int count =0;
			for(int j=0;j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
			}
			if(count>1) {
				newstr =newstr+count;
			}
			else {
			newstr = newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);

	}

}
