package MapsPractice;
import java.util.*;

public class MaxKeyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> maps = new LinkedHashMap<>();
		maps.put(5,"nine");
		maps.put(4,"four");
		maps.put(9,"two");
		int max =0;
		for(Map.Entry<Integer,String> entry:maps.entrySet()) {
			if(entry.getKey()>max) {
				max = entry.getKey();
				
			}
		}
		System.out.println(max);

	}

}
