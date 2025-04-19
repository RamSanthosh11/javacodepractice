package StringPractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class stringreversebyCollections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Split the string into individual words
        String[] wordsArray = str.split(" ");
        
        // Convert the array to a list
        List<String> wordsList = Arrays.asList(wordsArray);
        
        // Use Collections.reverse() to reverse the order of the words
        Collections.reverse(wordsList);
        
        // Join the words back into a single string
        String reversedStr = String.join(" ", wordsList);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedStr);
        
        sc.close();
    }
}
