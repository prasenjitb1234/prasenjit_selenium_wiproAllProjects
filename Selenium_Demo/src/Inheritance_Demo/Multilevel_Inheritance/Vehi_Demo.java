package Inheritance_Demo.Multilevel_Inheritance;

class Vehicle {
	int speed  = 70;
	
}

class car extends Vehicle{
	int speed = 100;
	void showspeed() {
		System.out.println("Car Normal Speed : "+speed); // 100
//		System.out.println(this.speed);
		System.out.println("Vehicle Normal Speed : "+super.speed); // 70
	}
}



public class Vehi_Demo {
	public static void main(String[] args) {
		
		car c = new car();
		c.showspeed();
	}
}
