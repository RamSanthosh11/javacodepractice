package JavaTopics;

public class concreteclass {
    
     public static class Login {
    	 
       public  void showLoginStatus() {
    	   
            System.out.println("Login attempt completed.");
        }
       
    }

 

    public static void main(String[] args) {
   
        Login emailLogin = new Login();
        emailLogin.showLoginStatus();
    }
}
