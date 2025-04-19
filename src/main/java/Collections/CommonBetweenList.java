package Collections;
import java.util.*;

public class CommonBetweenList {

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(5, 0, 1, 3, 4, 8, 1));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(5, 9, 2, 0, 1, 3));

        // Create a HashSet directly from the ArrayList
        HashSet<Integer> common = new HashSet<>(array1);

        System.out.println("HashSet (unique elements of array1): " + common);
        for(int i : array2) {
        	if(common.contains(i)) {
        		System.out.print(i+" ");
        	}
        }
        System.out.println("ArrayList array2: " + array2);
    }
}