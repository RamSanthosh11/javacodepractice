package stringinterviewpractice;
import java.util.*;

public class LargestWord {

	public static void main(String[] args) {
		 System.out.println("Try programiz.pro");
	        String s="Java is a programming language a and Java is also an island";
	        String[] str1 = s.split(" ");
	        String longest ="";
	        String longestt ="";
	        for(String s1 :str1){
	        if(s1.length() > longest.length()){
	          longestt = longest;
	          longest = s1;
	        }
	        else if(s1.length() > longestt.length()){
	            longestt = s1;
	            
	        }
	        }
	        System.out.println(longest);
	        System.out.println(longestt);

	}
	}