package stringinterviewpractice;
import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		
		  // Minimal change: make it case-insensitive
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
		

		char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();
        
        if(arr1.length!=arr2.length) {
        	System.out.println(string1+" "+"and"+" "+string2+"are not anagrams");
        }
        else {
        	int count = 0;
        	for(int i=0;i<arr1.length;i++) {
        		for(int j=0;j<arr2.length;j++) {
        			if(arr1[i]==arr2[j]) {
        				count++;
        				arr2[j] = '\0';
        				break;
        				
        			}
        		}
        	}
        	if(count==arr1.length) {
            	System.out.println(string1+" "+"and"+" "+string2+" are  anagrams");
        	}
        	else {
            	System.out.println(string1+" "+"and"+" "+string2+" are not anagrams");

        	}
        }
		//System.out.println(string1.equals(string2));

	}

}
