package JavaTopics;

class Aimal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Aimal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpDownCastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object referred by Animal reference
        Aimal myAnimal = new Dogs();  // Upcasting happens automatically
        myAnimal.eat();               // Works: inherited method
        // myAnimal.bark();           // ERROR: cannot access subclass method directly

        // Downcasting: Animal reference cast back to Dog
        Dogs myDog = (Dogs) myAnimal;   // Explicit cast
        myDog.bark();                 // Works: subclass method accessible
        myDog.eat();                  // Works: inherited method

       
    }
}
