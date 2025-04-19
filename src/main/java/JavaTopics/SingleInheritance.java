package JavaTopics;

class Anima {
	String color = "white";
    void sound() {
        System.out.println("Animal Makes sound");
    }
    void eat(){
    	System.out.println("eating...");
    	}  

}

class Dogg extends Anima { //single inheritance
	String color = "black";
    void bark() {
        super.eat();
    	System.out.println("Color from child class.."+color);
    	System.out.println("Color from parent  class.."+super.color); //super keyword usage for fields
    	
        System.out.println("Dog Bark");
    }
    void eat(){
    	System.out.println("eating bread...");
    	}  
    //super.eat();

}

class Puppy extends Dogg{ //multiplevel
	void play() {
		System.out.println("Puppy plays");
	}
}

//hirerchical inheritance
class Cow extends Anima {
    void amba() {
        System.out.println("cow..");
    }
}

class Cat extends Anima {
    void meow() {
        System.out.println("Cat meows");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
    	
    	//single inheritance
    	System.out.println("Single Inheritance Example");
        Dogg d = new Dogg();
        d.eat();
        //d.sound();  // Inherited from Animal
        d.bark();   // Defined in Dog
        
        //multilevel inheritance
        System.out.println("MultiLevel Inheritance Example");
        Puppy puppy = new Puppy();
        puppy.sound();
        puppy.bark();
        puppy.play();
        
        //Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance");
        Cow cow = new Cow();
        cow.sound();
        cow.amba();
        
        Cat cat = new Cat();
        cat.sound();
        cat.meow();        
        
    }
}
