package Polymorphism_Practice.example1;

// method overriding 
class Employee {
	void work() {
		System.out.println("Employee Works in Wipro");
	}
	
	void salary() {
		System.out.println("Salary = Basic Salary..");
	}
}


class Developer extends Employee {
	
	void work() {
		System.out.println("Developer write Code ");
	}

	
	void salary() {
		System.out.println("Salary = 40000 per month");
	}
}


class Manager extends Employee {
	
	void work() {
		System.out.println("Manager Manages  team");
	}

	
	void salary() {
		System.out.println("Salary = 80000 per month");
	}
}


public class Employee_Demo {
	public static void main(String[] args) {
		
		System.out.println("Developer Details:");
		Developer dev = new Developer();
		dev.work();
		dev.salary();
		
		System.out.println("\nManager Details:");
		Manager mg = new Manager();
		mg.work();
		mg.salary();
	}
}
