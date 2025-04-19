package JavaTopics;


class AnimalS {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogS extends AnimalS {
    void sound() {  // No @Override annotation, but still valid
        System.out.println("Dog barks");
    }
}

class CatS extends AnimalS {
    void sound() {  // No @Override annotation, but still valid
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AnimalS myDog = new DogS();
        AnimalS myCat = new CatS();
        
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}
