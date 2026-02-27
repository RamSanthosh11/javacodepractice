package JavaTopics;

public final class finalclass {

    public void displayMessage() {
        System.out.println("Hello, this is from the final class!");
    }

    public static void main(String[] args) {

        finalclass fc = new finalclass();
        fc.displayMessage();
    }
}
