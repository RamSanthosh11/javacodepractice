package JavaTopics;

class Loogin {

    public void showLoginStatus() {
        System.out.println("Login attempt completed.");
    }
}

public class concreteclass {

    public static void main(String[] args) {
        Loogin login = new Loogin();
        login.showLoginStatus();
    }
}
