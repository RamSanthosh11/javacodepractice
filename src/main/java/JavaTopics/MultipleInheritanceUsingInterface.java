package JavaTopics;

interface ANIMAL{
	void sound();
}
interface PET{
	void play();
}

class Doggg implements ANIMAL,PET{
	public void sound() {
		System.out.println("Dog Barks");
	}
	public void play() {
		System.out.println("Dog Plays");
	}
	
}
public class MultipleInheritanceUsingInterface {
	public static void main(String[] args) {
		Doggg dog = new Doggg();
		dog.sound();
		dog.play();
	}

}
