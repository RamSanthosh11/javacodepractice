class Outer {
    
    // Method with a method local inner class
    void outerMethod() {
        int localVar = 10; // Local variable in the method
        
        // Method Local Inner Class
        class LocalInner {
            void show() {
                // Accessing the local variable of the method
                System.out.println("Local variable from outerMethod: " + localVar);
            }
        }
        
        // Creating an instance of the inner class
        LocalInner inner = new LocalInner();
        inner.show(); // Calls show method of LocalInner
    }
}

public class methodlocalinnerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();  // Calls outerMethod, which contains the method local inner class
    }
}
