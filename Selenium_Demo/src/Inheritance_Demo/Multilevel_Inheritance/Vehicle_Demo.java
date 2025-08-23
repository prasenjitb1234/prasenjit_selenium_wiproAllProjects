package Inheritance_Demo.Multilevel_Inheritance;

class Vehicles // super class
{

	void color(String colors) {
		System.out.println("Color of Vehicle is : " + colors);
	}

}

class Four_Wheeler extends Vehicles {

	void vehicleType(boolean wheels) {
		System.out.println("is Four Wheeler : " + wheels);
	}

}

class PetrolCar extends Four_Wheeler {
	void FuelType(String fuels) {
		System.out.println("Fuel Type : " + fuels);
	}
}

class FiveSeatingArrangement extends PetrolCar {
	void NumberOfSeats(int seats) {
		System.out.println("Number of Seats : " + seats);
	}
}

class CarCompany extends FiveSeatingArrangement  // recent child class
{
	void carCompany(String carName) {
		System.out.println("Car Company is : " + carName);
	}
}

public class Vehicle_Demo {
	public static void main(String[] args) {

		System.out.println("****For Baleno Car ****");
		CarCompany cr = new CarCompany();

		cr.color("Red");
		cr.vehicleType(true);
		cr.FuelType("Petrol ");
		cr.NumberOfSeats(5);
		cr.carCompany("Baleno");
		
		
		
		

	}
}
