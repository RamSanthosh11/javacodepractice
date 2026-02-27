package stringinterviewpractice;
import java.util.*;

public class LargestWord {

	public static void main(String[] args) {
		String s = "Java is a programming language and Java is also an island";
        String[] sarray = s.split(" ");
        
        String small = sarray[0];
        String large = sarray[0];

        for (int i = 1; i < sarray.length; i++) {
            if (sarray[i].length() > large.length()) {
                large = sarray[i];
            }
            if (sarray[i].length() < small.length()) {
                small = sarray[i];
            }
        }

        System.out.println("Largest word: " + large);
        System.out.println("Smallest word: " + small);

	}
	}