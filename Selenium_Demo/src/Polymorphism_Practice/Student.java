package Polymorphism_Practice;

// method overloading

public class Student {
	
	void details(int rollno) {
		System.out.println("Roll No : "+rollno);
	}
	
	void details(int rollno, String name) {
		System.out.println("Roll NO : "+rollno);
		System.out.println("Name: "+name);
	}
	
	void details(String name, int rollno) {
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollno);
	}
	
	void details (int rollno, String name, float per) {
		System.out.println("RollNo : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("percentage : "+per);
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		System.out.println("**** Student RollNo : ");
		stud.details(101);
		System.out.println("*** Student Roll No & marks : ");
		stud.details(101, "Prasenjit");
		
		System.out.println("***student name and rollno********");
		stud.details("Reeva Verma", 103);
		System.out.println("***student rollno, name and percentage********");
		stud.details(104, "Shiva Upadhyay", 89.9f);
		
		
	}
	
	
}
