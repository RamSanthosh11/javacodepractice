package JavaTopics;
import java.util.Arrays;

public class arraymethods {
	    public static void main(String[] args) {
	        // Example 1: Arrays.toString()
	        int[] numbers = {5, 3, 8, 1, 4};
	        System.out.println("Original array: " + Arrays.toString(numbers));
	        
	        // Example 2: Arrays.sort()
	        Arrays.sort(numbers);
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	        
	        // Example 3: Arrays.copyOf()
	        int[] copiedArray = Arrays.copyOf(numbers, 7); // Resize the array to 7 elements
	        System.out.println("Copied array: " + Arrays.toString(copiedArray));
	        
	        // Example 4: Arrays.equals()
	        int[] anotherArray = {1, 2, 3};
	        System.out.println("Arrays are equal: " + Arrays.equals(numbers, anotherArray));
	        
	        // Example 5: Arrays.fill()
	        Arrays.fill(copiedArray, 99); // Fill all elements of copiedArray with 99
	        System.out.println("Array after fill: " + Arrays.toString(copiedArray));
	        
	        // Example 6: Arrays.binarySearch()
	        int index = Arrays.binarySearch(numbers, 4);  // Binary search only works on sorted arrays
	        System.out.println("Index of 4: " + index);
	        
	        // Example 7: Arrays.stream()
	        int sum = Arrays.stream(numbers).sum();
	        System.out.println("Sum of numbers: " + sum);
	        
	        // Example 8: Arrays.asList()
	        String[] names = {"Alice", "Bob", "Charlie"};
	        System.out.println("Names as list: " + Arrays.asList(names));
	    }
	}



