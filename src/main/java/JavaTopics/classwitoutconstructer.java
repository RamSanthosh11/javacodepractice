package JavaTopics;

public class classwitoutconstructer {
    public static void main(String[] args) {
        // Creating a Car object using the default constructor (no arguments)
        Car myCar = new Car();
        
        // Displaying default values (fields initialized to default values)
        myCar.displayInfo();  // Output: Car Model: null, Color: null, Year: 0

        // Manually setting the fields
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2022;
        
        // Displaying updated information
        myCar.displayInfo();  // Output: Car Model: Toyota, Color: Red, Year: 2022
    }
    
    // Static nested Car class
    static class Car {
        // Fields (Attributes)
        String color;
        String model;
        int year;

        // Method to display car information
        public void displayInfo() {
            System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
        }
    }
}
