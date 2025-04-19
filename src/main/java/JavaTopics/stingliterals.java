package JavaTopics;

public class stingliterals {

	public static void main(String[] args) {
		
		String str = "hello, \nworld";
		System.out.println(str);
		
		String str1 = "hello:\tworld";
		System.out.println(str1);
		
		String str3= "C\\hello\\tworld\\kite";
		System.out.println(str3);
		
		String doublequote = "He said, \"Hello, World!\"";
		System.out.println(doublequote);
		
		String apostrophe = "It\'s a beautiful day!";
		System.out.println(apostrophe);
		// Output: It's a beautiful day!

		//concatination the stings
		String name = "Alice";
		String message = "Hello, " + name + "!";
		System.out.println(message);  // Outputs: Hello, Alice!
		
		//sting interpolation used to strore multiple values
		String textBlock = """
                This is a text block.
                It preserves new lines,
                spaces, and formatting.
                """;
		System.out.println(textBlock);
		//Outputs:
		//This is a text block.
		//It preserves new lines,
		//spaces, and formatting.
		
		
		String s1 = "Java";
		String s2 = s1.concat(" Programming");
		System.out.println(s1);  // Outputs: Java
		System.out.println(s2);  // Outputs: Java Programming
		
		
		//string pool
		String str11 = "Hel1lo";
		String str22 = "Hello";
		System.out.println(str11 == str22);  // Outputs: true (both refer to the same object in the string pool)




	}

}
