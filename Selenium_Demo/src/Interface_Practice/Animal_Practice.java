package Interface_Practice;

//class-class --> extends keyword is used 
//interface-interface --> extends keyword is used 
//interface-class --> implements keyword is used 

interface Animal {

	void eat(); // public and abstract

	void sound();

	default void show() {
		System.out.println("Hello");
	}
}

class Dog implements Animal {

	public void eat() {
		System.out.println("Royal Canin");

	}

	public void sound() {
		System.out.println("Barking");

	}

}

public class Animal_Practice {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
		d.sound();

	}
}
