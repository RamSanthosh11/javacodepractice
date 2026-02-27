package ListsPractice;
import java.util.*;
import java.util.LinkedHashMap;
public class DigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int inputEle = sc.nextInt();
            arr.add(inputEle);
        }
        LinkedHashMap<Integer,Integer> maps = new LinkedHashMap<>();
        for(int num :arr) {
        	maps.put(num,maps.getOrDefault(num,0)+1);
        	
        }
        System.out.println("duplicates count List: " + maps);
    }
}