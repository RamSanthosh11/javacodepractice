package JavaTopics;


public class staticclass {
  
    // This is a final class
    static class FinalClass {
    	
        public void displayMessage() {
        	
            System.out.println("Hello, this is from the final class!");
        }
    }
    
    public static void main(String[] args) {
    	
    	//using static keyword at final class 
    	FinalClass FC = new FinalClass();
    	FC.displayMessage();
    	
    }
}
