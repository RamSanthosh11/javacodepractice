package MapsPractice;
import java.util.*;
import java.util.Map.Entry;

public class ReverseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> maps = new LinkedHashMap<>();
		maps.put("Ram", 3);
		maps.put("Pavan", 5);
		maps.put("Super", 5);
		
		List<Map.Entry<String,Integer>> list = new ArrayList<>(maps.entrySet());
		Collections.reverse(list);
		
		LinkedHashMap<String,Integer> reversemaps = new LinkedHashMap<>();
		for(Entry<String,Integer> entry :list) {
			reversemaps.put(entry.getKey(),entry.getValue());
			
		}
		System.out.println(reversemaps);

	}

}
