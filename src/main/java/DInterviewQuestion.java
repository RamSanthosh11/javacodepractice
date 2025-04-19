import java.util.*;

public class DInterviewQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next(); // Get user input
        str = str.toUpperCase(); // Convert to uppercase for consistency

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1); // Update the count of the character
        }

        // Prepare the output in the desired format
        StringBuilder output = new StringBuilder("[");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            output.append("(").append(entry.getKey()).append(",").append(entry.getValue()).append("),");
        }
        output.deleteCharAt(output.length() - 1); // Remove the trailing comma
        output.append("]");
        
        System.out.println("Output: " + output);
    }
}