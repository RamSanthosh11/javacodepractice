package JavaTopics;

public class operators {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c= 15;
		
		System.out.println(a++);//first print then increase value by 1 now a value is 11
		System.out.println(++a);// 11+1 a values is 12
		
		System.out.println(b--); //now b vlue will be 4
		System.out.println(--b); /// now b value will be 3
		
		int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
        
        
        //relational operator
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        
        //logical operator
        
        System.out.println("Logical operatos.....");
     // AND operator (&&)
        // Check if 'a' is greater than 5 AND 'b' is greater than 10
        System.out.println("a > 5 AND b > 10: " + (a > 5 && b > 10));  // Output: true

        // OR operator (||)
        // Check if 'a' is less than 5 OR 'c' is greater than 10
        System.out.println("a < 5 OR c > 10: " + (a < 5 || c > 10));  // Output: true

        // NOT operator (!)
        // Check if it's NOT true that 'a' is less than 10
        System.out.println("NOT (a < 10): " + !(a < 10));  // Output: false

        // Combined logical expressions
        // Check if 'a' is less than 15 AND 'b' is greater than 10 OR 'c' equals 15
        System.out.println("a < 15 AND b > 10 OR c == 15: " + ((a < 15 && b > 10) || c == 15));  // Output: true
        
        
        //ternary operator
        System.out.println("ternary operator...");
        String result = (a>b) ? "a is greater":"b is greater";
        System.out.println(result);
        String result1 = ((a%2)==0) ? "a is even":"b is odd";
        System.out.println(result1);
        
        
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
        
        
        System.out.println("shift operators....");
        
        int x =8;
        System.out.println(x<<1);
        
        System.out.println(x>>1);
        
        System.out.println(x>>>1);
    }


	}


