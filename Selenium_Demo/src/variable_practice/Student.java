package variable_practice;

public class Student {

	int rollno, age; // instance variable -> global variable
	String name;
	float per;
	static String collegename = "JVM"; // static variable -> common data

	void details(int rollno1, int age1, String name1, float per1) // local variable
	{
		rollno = rollno1;
		age = age1;
		name = name1;
		per = per1;

		System.out.println("Roll No : " + rollno);
		System.out.println("Age : " + age);
		System.out.println("Percentage : " + per);
		System.out.println("Name : " + name);
		System.out.println("College Name: " + collegename);

	}

	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("******** First Student ********");

		stud.details(101, 20, "Prasenjit Bhosale", 98.8f);
		System.out.println("******** Second Student ********");

		stud.details(102, 21, "Peter Parker", 95.4f);
		System.out.println("******** Third Student ********");
		stud.details(103, 22, "Tony Stark", 88.4f);

		System.out.println("******** Fourth Student ********");
		stud.details(104, 22, "Wanda Mazimoff", 78.9f);
	}
}
