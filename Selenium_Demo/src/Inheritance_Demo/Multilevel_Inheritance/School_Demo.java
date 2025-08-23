package Inheritance_Demo.Multilevel_Inheritance;


class School{
	
	
	School(){
		System.out.println("One particular format uniform");
		System.out.println("Follow Patterns like CBSC, ICSC, and state board");
		System.out.println("Follow timming for is Between  7 to 5");
	}
}

class SNBP extends School{
	SNBP(){
		super();
		System.out.println("Pattern of Study like 70% study and 30% Sports");
	}
}

class DPS extends School{
	DPS(){
		super();
		System.out.println("Delhi's Best School");
	}
}



public class School_Demo {
	public static void main(String[] args) {
		
		
		SNBP snbp = new SNBP();
		// this is constructor chaining where we used super keyword to inherit properties from parent class's constructor
		
		
		
		
		
		
		
	}
}
