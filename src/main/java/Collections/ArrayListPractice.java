package Collections;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			int inputelement = sc.nextInt();
			arr.add(inputelement);
		}
		System.out.println("accessing list elements..."+arr.get(0));
		
		arr.set(0, 1);
		System.out.println("accessing list element after updating..."+arr.get(0));
		
		System.out.println("verify element present or not..."+arr.contains(1));
		
		System.out.println("size of  list elements..."+arr.size());
		
		arr.remove(0);
		
		System.out.println("size after removing  list element..."+arr.size());
		
		arr.forEach(System.out::println);




	}

}
