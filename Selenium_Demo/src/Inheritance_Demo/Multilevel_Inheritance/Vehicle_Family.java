package Inheritance_Demo.Multilevel_Inheritance;

class Vehicle2 {

	void start(String st) {
		System.out.println("starts with : " + st);
	}

	void stop(String st) {
		System.out.println("stop with : " + st);
	}
}

class Car1 extends Vehicle2 {
	void type_of_car(String type) {
		System.out.println(type + " Car");
	}

	void no_of_seats(int st) {
		System.out.println("Number of Seats " + st);
	}
}

class Baleno extends Car1 {

	void color(String color) {
		System.out.println("Color is : " + color);
	}

}

class Ertica extends Car1 {
	void color(String color) {
		System.out.println("Color is : " + color);
	}
}

class Scooter extends Vehicle2 {

	void type_of_scooter(String type) {
		System.out.println(type + " scooter");
	}

	void no_of_seats(int st) {
		System.out.println("Number of seats : " + st);
	}

}

class Activa extends Scooter{
	void speed(int sp) {
		System.out.println("Speed is : "+sp);
	}
}


public class Vehicle_Family {

	public static void main(String[] args) {
		
		System.out.println("******Baleno Car ********");
		Baleno b1 = new Baleno();
		b1.color("blue");
		b1.start("key, button");
		b1.stop("key, button");
		b1.no_of_seats(5);
		b1.type_of_car("Diesel");
		
		System.out.println("******Ertica  Car ********");
		Ertica e1 = new Ertica();
		e1.color("White");
		e1.no_of_seats(7);
		e1.start("key, button");
		e1.stop("key, button");
		e1.type_of_car("Diesel");
		
		// same for activa scooter
		
		
		
		
	}

}
