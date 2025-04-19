package JavaTopics;

public class enums {

	 enum Day {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	    }

	    public static void main(String[] args) {
	        // Create a variable of enum type
	        Day today = Day.MONDAY;

	        // Using the name() method to get the name of the enum constant
	        System.out.println("Today is: " + today.name());  // Output: Today is: MONDAY

	        // Using the ordinal() method to get the position of the enum constant
	        System.out.println("The ordinal of today is: " + today.ordinal());  // Output: The ordinal of today is: 0

	        // Using valueOf() method to get enum constant by name
	        Day day = Day.valueOf("TUESDAY");
	        System.out.println("The day is: " + day);  // Output: The day is: TUESDAY

	        // Using the values() method to get all enum constants
	        System.out.println("All days of the week:");
	        for (Day d : Day.values()) {
	            System.out.println(d);  // Output: All days of the week: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	        }
	    }
	}