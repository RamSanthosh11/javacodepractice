package MapsPractice;
import java.util.*;
import java.util.LinkedHashMap;

public class DecendingSortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> maps = new LinkedHashMap<>();
		maps.put(2,"two");
		maps.put(9,"Nine");
		maps.put(1,"one");
		maps.put(4, "four");
		
		List<Map.Entry<Integer,String>> list = new ArrayList<>(maps.entrySet());
		list.sort(Map.Entry.<Integer,String>comparingByKey().reversed());
		
		LinkedHashMap<Integer,String> desmap = new LinkedHashMap<>();
		for(Map.Entry<Integer,String> entry:list) {
			desmap.put(entry.getKey(),entry.getValue());
			
		}
		System.out.println(maps);
		System.out.println(desmap);
		System.out.println(desmap.replace(4, "fourr"));
		System.out.println(desmap);

	}

}
