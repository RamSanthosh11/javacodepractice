package stringinterviewpractice;
import java.util.*;

public class DuplicateCharactersWithoutSet {

	    public static void main(String[] args) {
	        String s = "Javaa";
	        char[] arr = s.toCharArray();

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] == '0') {
	                continue;   // already counted
	            }

	            int count = 1;  // count itself

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j] = '0'; // mark duplicates only
	                }
	            }

	            if (count > 1) {
	                System.out.println(arr[i] + " = " + count);
	            }
	        }
	    }
	}
