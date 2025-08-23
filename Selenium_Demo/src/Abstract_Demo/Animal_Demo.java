package Abstract_Demo;


abstract class Animal{
	void eat() {
		System.out.println("Eating");
	}
	
	abstract void sound();
	
	
}

class Dog extends Animal{
	void sound() {
		System.out.println("Sound = Barking ");
	}
	
	
	
}

class Tiger extends Animal{
	
	void sound() {
		System.out.println("Sound = Roar");
	}
}



public class Animal_Demo {
	
	public static void main(String[] args) {
		
		System.out.println("****** Dog ******");
		Dog d = new Dog();
		d.eat();
		d.sound();
		
		System.out.println("***** Tiger ******");
		Tiger t = new Tiger();
		t.eat();
		t.sound();
		
		
		
	}
	
	
	
	
}
