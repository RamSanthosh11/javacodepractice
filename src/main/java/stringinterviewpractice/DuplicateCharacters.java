package stringinterviewpractice;
import java.util.*;

public class DuplicateCharacters {

	public static void main(String[] args) {
		        String s="rammr";
		        HashSet<Character> original = new HashSet<>();
		        for(int i =0;i<s.length();i++){
		            char c = s.charAt(i);
		            if(!original.contains(c)){
		            int count =0;
		            for(int j=i;j<s.length();j++){
		                if(s.charAt(j) == c)
		                count++;
		            }
		            original.add(c);
		            if(count>1) {	
		            System.out.println(c+" count is "+count);
		            }
		            }
		        }
		    }
		} 