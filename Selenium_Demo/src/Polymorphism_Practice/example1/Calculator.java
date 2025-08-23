package Polymorphism_Practice.example1;

// method Overloading 

public class Calculator {

	
	void add(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}

	
	void add(int a, int b, int c) {
		System.out.println("Sum : " + (a + b + c));
	}

	
	void add(double a, double b) {
		System.out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();

		System.out.println("Add two Numbers ");
		c.add(10, 20);

		System.out.println("Add three Numbers  ");
		c.add(5, 15, 25);

		System.out.println("Add two decimal number");
		c.add(10.5, 20.3);
	}
}
