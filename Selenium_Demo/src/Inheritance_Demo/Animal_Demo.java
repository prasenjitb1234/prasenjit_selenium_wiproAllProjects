package Inheritance_Demo;

class Animal {

	void eat(String eats) {
		System.out.println("Eats : " + eats);
	}

	void sound(String sd) {
		System.out.println("Sound : " + sd);
	}

}

class DomesticAnimal extends Animal {

	void lives(String live) {
		System.out.println("Lives in the : " + live);
	}

}

public class Animal_Demo {
	public static void main(String[] args) {

		System.out.println("****** Dog *******");
		DomesticAnimal dog = new DomesticAnimal();

		dog.eat("Pedigree");
		dog.sound("Bark");
		dog.lives("City");

		System.out.println("****** Cat *******");
		DomesticAnimal cat = new DomesticAnimal();
		cat.eat("Fish");
		cat.sound("Meow");
		cat.lives("City");

		System.out.println("****** Cow *******");

		DomesticAnimal cow = new DomesticAnimal();
		cow.eat("Grass");
		cow.sound("Mooo");
		cow.lives("Farm");
		
		

	}
}
