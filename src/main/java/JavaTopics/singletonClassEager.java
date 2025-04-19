package JavaTopics;

// Singleton class using Eager Initialization
class Singleton {
    // 1. Private static instance created eagerly (at the time of class loading)
    private static final Singleton instance = new Singleton();

    // 2. Private constructor to prevent instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created eagerly!");
    }

    // 3. Public method to provide access to the instance
    public static Singleton getInstance() {
        return instance;
    }

    // Example method to show functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Main class to test the Singleton
public class singletonClassEager {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton1.showMessage();

        // Check if both references point to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Singleton failed!");
        }
    }
}