package Interface_Practice;

// Multiple Inheritance is Possible using Interface in Java

interface Parent1 {
	void flat();

	void car();

}

interface Parent2 {
	void flat();

	void bike();
}

class Child implements Parent1, Parent2 {

	public void bike() {

		System.out.println("Sports Bike");
	}

	public void flat() {

		System.out.println("2 BHK Flat");
	}

	public void car() {

		System.out.println("Sports Car");

	}

}

public class Family {
	public static void main(String[] args) {

		Child c = new Child();
		c.bike();
		c.car();
		c.flat();

	}
}
