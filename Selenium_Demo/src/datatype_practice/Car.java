package datatype_practice;

public class Car {

	int modelNo = 101;
	String carName = "Tesla";
	String carType = "Electric";
	String color = "Red";
	double price = 75000.00;
	boolean isAutomatic = true;
	

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("car name :  "+car1.carName);
		System.out.println(car1.carType);
		System.out.println(car1.color);
		System.out.println(car1.modelNo);
		System.out.println(car1.price);
		
		
		
		

	}
}
