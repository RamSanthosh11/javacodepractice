package JavaTopics;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class MatchMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner("Java 123 Python 456");
        sc.next(); // Skip "Java"
        sc.nextInt(); // Read 123
        
        // Get the MatchResult for the last match (123)
        MatchResult match = sc.match();
        System.out.println("Last matched token: " + match.group());
        System.out.println("Start index: " + match.start());
        System.out.println("Last index: " + match.end());
        System.out.println("Group count: " + match.groupCount()); // Group count should be 0

        sc.close(); // Close the Scanner
    }
}
