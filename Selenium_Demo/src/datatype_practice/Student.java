package datatype_practice;

public class Student {
	
	String name = "Prasenjit";
	int rollNo = 101;
	short age = 22;
	float percentage = 90.5f;
	String course = "Java Selenium";
	String collegeName = "KBP";
	String address ="50, ABC, Mumbai";
	char div = 'A';
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		System.out.println("name : "+stud.name);
		System.out.println("age : "+stud.age);
		System.out.println("rollNo : "+stud.rollNo);
		System.out.println("percentage : "+stud.percentage);
		System.out.println("course : "+stud.course);
		System.out.println("college : "+stud.collegeName);
		System.out.println("address : "+stud.address);
		System.out.println("div : "+stud.div);
		
		
		
	}
}
