package ArraysPractice;
import java.util.*;

public class SecondSmallandLargestNumbersM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,9,1,4,3,2,6};
		Arrays.sort(array);
		int Smallest = array[0];
		int SecondSmallest = array[1];
		int largest = array[array.length-1];
		int Secondlargest = array[array.length-2];
		System.out.println(Smallest);
		System.out.println(SecondSmallest);
		System.out.println(largest);
		System.out.println(Secondlargest);


	}

}
