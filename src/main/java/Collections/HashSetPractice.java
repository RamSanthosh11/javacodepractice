package Collections;
import java.util.*;

public class HashSetPractice {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Bananaa");
		set.add("Apple");
		set.add("carrot");
		set.add("rat");
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			set.add(str);
			
		}
		*/
		System.out.println("Very whether element is present or not.."+set.contains("Banana"));
		System.out.println("removing the element..."+set.remove("Banana"));
		System.out.println(set);
		System.out.println("get the size of element..."+set.size());
		for (String s : set) {
            System.out.println(s);
        }
		System.out.println(set);
	}

}
