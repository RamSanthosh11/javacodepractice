package JavaTopics;

class Outer1 {
    static int staticVar = 50;  // Static variable
    int instvar = 30;

    // Static Nested Class
    static class StaticNested {
        void display() {
            // Accessing static variable from the outer class
            System.out.println("Static variable from outer class: " + staticVar);
            System.out.println("instance variable from outer class: " + instvar);

            
        }
    }
}

public class staticnestedclass {
    public static void main(String[] args) {
        // Creating an object of the static nested class without creating an instance of the outer class
        Outer1.StaticNested nestedObj = new Outer1.StaticNested();
        
        // Calling the display method of StaticNested
        nestedObj.display();
    }
}
