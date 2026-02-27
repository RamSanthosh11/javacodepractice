package MapsPractice;
import java.util.*;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Apple", 10);
        map.put("Applee", 101);
        map.put("Applee", 101);

        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++) {
        	String str = sc.next();
        	int keyvalue = sc.nextInt();
        	map.put(str, keyvalue);
        }
        
        System.out.println("Getting the element by key.."+map.get("Appleee"));
        
        System.out.println("Verify whether element is present or not..."+map.containsKey("Banana"));
        
        System.out.println("Removes the element for map..."+map.remove("Banana"));
        //if the element is not present then it will return the null
        
        System.out.println("size of HasMap..."+map.size());
        
        HashMap<String, Integer> map1 = new HashMap<>();
        
        map1.putAll(map); //copies elements of map to map1

        System.out.println(map1);
        
        
        System.out.println("iterating through entryset");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
        System.out.println("iterating through keysets");
        for(String s :map.keySet()) {
        	System.out.println(s);
        	
        }
        
        System.out.println("iterating through values");
        for(int s: map.values()) {
        	System.out.println(s);
        	
        }
        System.out.println("Iterating using forEach():");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println(map);

        

        
	}

}
