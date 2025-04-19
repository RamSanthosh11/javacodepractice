package JavaTopics;

public class abstractclass {
    
    static abstract class Login {
        abstract void performLogin(String username, String password);

        void showLoginStatus() {
            System.out.println("Login attempt completed.");
        }
    }

    static class EmailLogin extends Login {
        void performLogin(String username, String password) {
            System.out.println("Entered username: " + username);
            System.out.println("Entered password: " + password);
        }
    }

    public static void main(String[] args) {
   
        Login emailLogin = new EmailLogin();
        emailLogin.performLogin("ramu3317@gmail.com", "ramu4345");
        emailLogin.showLoginStatus();
    }
}
