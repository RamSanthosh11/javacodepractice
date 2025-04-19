package JavaTopics;

class Calculator{
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
	
	Calculator calc = new Calculator();
    System.out.println(calc.add(10, 20));        // Output: 30
    System.out.println(calc.add(10, 20, 30));    // Output: 60
    System.out.println(calc.add(10.5, 20.5));    // Output: 31.0

}
}
