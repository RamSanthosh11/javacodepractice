package MapsPractice;

import java.util.*;
import java.util.Map.Entry;
public class DuplicatesInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str= str.toUpperCase();
		LinkedHashMap<Character,Integer> duplicates = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			duplicates.put(ch,duplicates.getOrDefault(ch,0)+1);
		}
		System.out.println(duplicates.size());
		for(Entry<Character, Integer> entry :duplicates.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
			
		}
	}


