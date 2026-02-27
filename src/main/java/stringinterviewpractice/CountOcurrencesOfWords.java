package stringinterviewpractice;
import java.util.*;

public class CountOcurrencesOfWords {

	public static void main(String[] args) {
	        System.out.println("Try programiz.pro");
	        String s="Java is a programming language a and Java is also an island";
	        String[] str1 = s.split(" ");
	        HashSet<String> original = new HashSet<>();
	        for(int i =0;i<str1.length;i++){
	            String c = str1[i];
	            if(!original.contains(c)){
	            int count =0;
	            for(int j=i;j<str1.length;j++){
	                if(str1[j].equals(c)) {
	                count++;
	            }
	            original.add(c);
	            System.out.println(c+" count is "+count);
	            }
	        }
	    }
	}
}