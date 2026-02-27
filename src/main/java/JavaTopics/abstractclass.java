package JavaTopics;

abstract class Login {

    abstract void performLogin(String username, String password);

    void showLoginStatus() {
        System.out.println("Login attempt completed.");
    }
}

class EmailLogin extends Login {

    void performLogin(String username, String password) {
        System.out.println("Entered username: " + username);
        System.out.println("Entered password: " + password);
    }
}

public class abstractclass {

    public static void main(String[] args) {
        Login login = new EmailLogin();
        login.performLogin("ramu3317@gmail.com", "ramu4345");
        login.showLoginStatus();
    }
}
