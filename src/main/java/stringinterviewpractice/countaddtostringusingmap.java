package stringinterviewpractice;
import java.util.*;

public class countaddtostringusingmap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i =0;i<s1.length();i++) {
			char s = s1.charAt(i);
			
			map.put(s,map.getOrDefault(s,0)+1);
		}
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}		
	}

}
