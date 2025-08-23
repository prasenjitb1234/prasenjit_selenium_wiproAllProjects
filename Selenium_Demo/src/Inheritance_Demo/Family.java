package Inheritance_Demo;

class Mohan // parent
{

	void surname() {
		System.out.println("Sharma");

	}

	void flat() {
		System.out.println("2 BHK Flat");
	}

	void car() {
		System.out.println("Toyota");
	}

}

class Soham extends Mohan // child class extends parent
{

	void bike() {
		System.out.println("Pulsar");
	}

	void job() {
		System.out.println("Java Fullstack Developer ");
	}

}

public class Family {
	public static void main(String[] args) {

		Soham son = new Soham(); // here we always create object of child class
		
		System.out.print("Soham ");
		
		son.surname(); 	// can call parent method
		son.flat(); 	// can call parent method
		son.car(); 		// can call parent method
		son.bike(); 	// own method
		son.job(); 		// own method
		
		
		

	}

}
