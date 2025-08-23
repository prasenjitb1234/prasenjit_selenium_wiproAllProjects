package basics_of_oops.constructors;

public class Employee {
	
	Employee(){ // no argument constructor
		System.out.println("Default Constructor");
	}
	
	Employee(int id, String name) // parameterized constructor
	{
		System.out.println("Id is : "+id );
		System.out.println("Name is : "+name);
	}
	
	Employee(String name, int id) // parameterized constructor
	{
		
		System.out.println("Name is : "+name);
		System.out.println("Id is : "+id );
	}
	
	Employee(int id, String name, float salary) // parameterized constructor
	{
		System.out.println("Id is : "+id );
		System.out.println("Name is : "+name);
		System.out.println("Salary is : "+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee(1,"Prasenjit Bhosale",90000.0f);
		
		Employee e2 = new Employee("Peter Parker",2);
		
		Employee def = new Employee(); // calls default constructor
		
		Employee e3 = new Employee(4,"Tony Stark");
		
		
		
		
	}
}
