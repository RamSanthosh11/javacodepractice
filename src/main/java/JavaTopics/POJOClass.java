package JavaTopics;

public class POJOClass {
    private String make;

    public POJOClass(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static void main(String[] args) {
        POJOClass myCar = new POJOClass("Toyota");
        System.out.println("Make: " + myCar.getMake());

        myCar.setMake("Honda");
        System.out.println("Updated Make: " + myCar.getMake());
    }
}
