package MapsPractice;
import java.util.*;
public class SoryByKeyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> maps = new LinkedHashMap<>();
		maps.put(2,"two");
		maps.put(9,"Nine");
		maps.put(1,"one");
		maps.put(4, "four");
		
		// TreeMap sorts the map by keys automatically
        TreeMap<Integer,String> sortedMap = new TreeMap<>(maps);
        
        System.out.println(maps);
		System.out.println(sortedMap);

	}

}
