package JavaTopics;
abstract class Animal1 {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Non-abstract method (has implementation)
    void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal1 {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void wagTail() {
        System.out.println("Tail is wagging");
    }
}

public class AbstractandNonAbstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Calls the overridden abstract method
        dog.sleep();     // Calls the non-abstract method from the abstract class
        dog.wagTail();   // Calls the non-abstract method from the Dog class
    }
}
