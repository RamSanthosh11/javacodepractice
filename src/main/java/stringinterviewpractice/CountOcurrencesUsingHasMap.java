package stringinterviewpractice;
import java.util.*;

public class CountOcurrencesUsingHasMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s="Java is a programming language a and Java is also an island";
        String[] words = s.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<words.length;i++) {
        	String si = words[i];
        	map.put(si,map.getOrDefault(si,0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+""+entry.getValue());
        }
		
	}

}
