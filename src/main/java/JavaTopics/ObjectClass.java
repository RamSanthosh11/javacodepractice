package JavaTopics;

import java.util.Objects;

class Dog {
    String name;
    int age;

    // Constructor to initialize the Dog object
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1. toString() - Provides a string representation of the object
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }

    // 2. hashCode() - Generates a hash code based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 3. equals() - Compares two Dog objects for equality based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return age == dog.age && name.equals(dog.name);
    }

    // 4. finalize() - Called before garbage collection (use cautiously)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Dog " + name + " is being cleaned up!");
        super.finalize();  // Calling the superclass finalize method
    }

    // 5. getClass() - Gets the runtime class of the object
    public void printClassName() {
        System.out.println("Class Name: " + this.getClass().getName());
    }

    // 6. clone() - Creates a shallow copy of the Dog object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 7. wait(), notify(), notifyAll() - Used for concurrency
    synchronized void dogWait() throws InterruptedException {
        System.out.println(name + " is waiting...");
        wait();  // Put the thread into waiting state
    }

    synchronized void dogNotify() {
        System.out.println(name + " is notifying...");
        notify();  // Notify a waiting thread
    }

    synchronized void dogNotifyAll() {
        System.out.println(name + " is notifying all...");
        notifyAll();  // Notify all waiting threads
    }
}

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // Creating Dog objects
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Max", 4);
        Dog dog3 = new Dog("Buddy", 3);

        // 1. toString() - Print the string representation of the dog
        System.out.println(dog1.toString());  // Output: Dog{name='Buddy', age=3}

        // 2. hashCode() - Print the hash code of the dog
        System.out.println("dog1 hashCode: " + dog1.hashCode());

        // 3. equals() - Compare two dog objects
        System.out.println("dog1 equals dog2: " + dog1.equals(dog2));  // Output: false
        System.out.println("dog1 equals dog3: " + dog1.equals(dog3));  // Output: true

        // 4. finalize() - Simulate garbage collection (for demo purposes)
        dog1 = null;  // Make dog1 eligible for garbage collection
        System.gc();  // Request garbage collection (finalize() might be called)

        // 5. getClass() - Print the runtime class name
        dog1.printClassName();  // Output: Class Name: Dog

        // 6. clone() - Create a clone of dog1
        Dog clonedDog = (Dog) dog1.clone();
        System.out.println("Cloned dog: " + clonedDog);  // Output: Dog{name='Buddy', age=3}

        // 7. wait(), notify(), notifyAll() - Simulating a waiting and notifying thread

        // Create threads for wait/notify demonstration
        Thread thread1 = new Thread(() -> {
            try {
                dog1.dogWait();  // Dog will wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some work
                dog1.dogNotify();  // Notify the waiting thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();  // Start thread1 (will wait)
        thread2.start();  // Start thread2 (will notify after sleep)
    }
}
