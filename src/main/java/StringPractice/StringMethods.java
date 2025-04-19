package StringPractice;

public class StringMethods {
    public static void main(String[] args) {
        // 1. Length and Character Access
        String str = "Hello World";
        System.out.println("1. Length of the string: " + str.length()); // Output: 11
        System.out.println("   Character at index 1: " + str.charAt(1)); // Output: 'e'

        // 2. Substring Extraction
        System.out.println("2. Substring from index 6: " + str.substring(6)); // Output: "World"
        System.out.println("   Substring from index 0 to 5: " + str.substring(0, 5)); // Output: "Hello"

        // 3. String Comparison
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("3. Are str1 and str2 equal? " + str1.equals(str2)); // Output: false
        System.out.println("   Are str1 and str2 equal (ignore case)? " + str1.equalsIgnoreCase(str2)); // Output: true
        System.out.println("   Compare str1 and str2: " + str1.compareTo(str2)); // Output: negative value
        System.out.println("   Compare str1 and str2 (ignore case): " + str1.compareToIgnoreCase(str2)); // Output: 0

        // 4. Searching in Strings
        System.out.println("4. Does the string contain 'World'? " + str.contains("World")); // Output: true
        System.out.println("   Index of 'World': " + str.indexOf("World")); // Output: 6
        System.out.println("   Last index of 'World': " + str.lastIndexOf("World")); // Output: 6
        System.out.println("   Does the string start with 'Hello'? " + str.startsWith("Hello")); // Output: true
        System.out.println("   Does the string end with 'World'? " + str.endsWith("World")); // Output: true

        // 5. Modifying Strings
        System.out.println("5. Concatenation: " + str1.concat(" World")); // Output: "Hello World"
        System.out.println("   Replace 'l' with 'L': " + str1.replace('l', 'L')); // Output: "HeLLo"
        System.out.println("   Replace 'World' with 'Java': " + str.replace("World", "Java")); // Output: "Hello Java"
        System.out.println("   Lowercase: " + str.toLowerCase()); // Output: "hello world"
        System.out.println("   Uppercase: " + str.toUpperCase()); // Output: "HELLO WORLD"
        String strWithSpaces = "  Hello  ";
        System.out.println("   Trimmed string: '" + strWithSpaces.trim() + "'"); // Output: "Hello"

        // 6. Splitting and Joining
        String str3 = "Hello,World,Java";
        String[] parts = str3.split(",");
        System.out.println("6. Splitting the string:");
        for (String part : parts) {
            System.out.println("   " + part); // Output: "Hello", "World", "Java"
        }
        String joined = String.join("-", "Hello", "World", "Java");
        System.out.println("   Joined string: " + joined); // Output: "Hello-World-Java"

        // 7. Conversion
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("7. Converted number to string: " + numStr); // Output: "123"
        char[] chars = str1.toCharArray();
        System.out.println("   Converted string to char array:");
        for (char c : chars) {
            System.out.println("   " + c); // Output: 'H', 'e', 'l', 'l', 'o'
        }

        // 8. Miscellaneous
        String emptyStr = "";
        System.out.println("8. Is the string empty? " + emptyStr.isEmpty()); // Output: true
        String blankStr = "  ";
        System.out.println("   Is the string blank? " + blankStr.isBlank()); // Output: true (Java 11+)
        String repeatStr = "Hello";
        System.out.println("   Repeat the string 3 times: " + repeatStr.repeat(3)); // Output: "HelloHelloHello" (Java 11+)
    }
}
