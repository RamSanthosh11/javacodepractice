package MapsPractice;
import java.util.*;
public class FrequencyOfWordsMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		LinkedHashMap<String,Integer> maps = new LinkedHashMap<>();
		String[] str = string.split(" ");
		for(String word :str) {
			maps.put(word, maps.getOrDefault(word,0)+1);
		}
		
		System.out.println(maps);
		
		//example"this is a test this is only a test"

	}

}
