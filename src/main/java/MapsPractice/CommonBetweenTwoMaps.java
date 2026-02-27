package MapsPractice;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonBetweenTwoMaps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map1 = Map.of("A",1,"B",2,"C",3);
		Map<String,Integer> map2 = Map.of("D",1,"B",2,"C",3);
		Set<Map.Entry<String,Integer>> commonsetn = new HashSet<>(map1.entrySet());
		commonsetn.retainAll(map2.entrySet());
		System.out.println(commonsetn);
		


	}

}
