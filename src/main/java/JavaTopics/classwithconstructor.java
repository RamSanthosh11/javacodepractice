package JavaTopics;
public class classwithconstructor {
    public static void main(String[] args) {
        // Creating a Car object using the constructor to initialize fields
        Car myCar = new Car("Red", "Toyota", 2022);
        myCar.displayInfo();  // Output: Car Model: Toyota, Color: Red, Year: 2022
    }

    // Static nested Car class with a constructor
    static class Car {
        String color;
        String model;
        int year;

        // Constructor to initialize the fields
        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }

        // Method to display car information
        public void displayInfo() {
            System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
        }
    }
}
