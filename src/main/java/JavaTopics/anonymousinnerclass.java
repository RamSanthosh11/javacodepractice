package JavaTopics;

// Define the Animal class
class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

public class anonymousinnerclass {
    public static void main(String[] args) {
        // Create an anonymous inner class that extends the Animal class
        Animal myAnimal = new Animal() {
            // Overriding the sound() method
            void sound() {
                System.out.println("Bark!");
            }
        };
        
        // Calling the sound() method of the anonymous class
        myAnimal.sound();
    }
}
