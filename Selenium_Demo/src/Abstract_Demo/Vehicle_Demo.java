package Abstract_Demo;

abstract class Vehicle{
	abstract void no_of_tyre();
	
	abstract void no_of_seats();
	
	abstract void run_on();
	
	void start_stop() {
		System.out.println("Vehicle start on fuel and stop with button");
	}
}

class Car extends Vehicle{
	void no_of_tyre(){
		System.out.println("4 Wheels");
	}
	void no_of_seats() {
		System.out.println("5 or 7 seats");
	}
	void run_on() {
		System.out.println("Petrol, Diesel or Battery ");
	}
}




public class Vehicle_Demo {
	public static void main(String[] args) {
		System.out.println("**** Car : : **** ");
		Car c = new Car();
		c.no_of_tyre();
		c.no_of_seats();
		c.start_stop();
		c.run_on();
		
	}
	
}
