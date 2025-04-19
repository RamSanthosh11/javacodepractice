package JavaTopics;

public class finalclass {
  
    // This is a final class
    public final class FinalClass {
        public void displayMessage() {
            System.out.println("Hello, this is from the final class!");
        }
    }
    
    // Attempt to extend the final class (This will cause an error)
    public class SubClass extends FinalClass {
        public void displayMessage1() {
            System.out.println("Hello from the subclass!");
        }
    }

    public static void main(String[] args) {
    	
    	/*
        finalclass demo = new finalclass();

        // Without using static keyword
        FinalClass finalClassInstance = demo.new FinalClass();
        finalClassInstance.displayMessage();

        // Attempting to create an instance of SubClass (This will cause an error)
        SubClass subClassInstance = demo.new SubClass();
        subClassInstance.displayMessage1();
        
        */
    	
    	FinalClass FC = new finalclass().new FinalClass();
    	FC.displayMessage();
    	
    	FinalClass SC = new finalclass().new SubClass();
    	SC.displayMessage();
    	
    	
    	//using static keyword at final class 
    	//FinalClass FC = new FinalClass();
    	//FC.displaymessage();
    	
    }
}
