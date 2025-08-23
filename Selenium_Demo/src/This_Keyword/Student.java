package This_Keyword;

public class Student {
	
	int rollno, age;
	String name, collegename, address;
	float per;
	
	
	void details(int rollno, String name, float per) {
		this.rollno = rollno;
		this.name = name;
		this.per = per;
		System.out.println("Roll NO : "+rollno);
		System.out.println("name : "+name);
		System.out.println("percentage : "+per);
	}
	
	void details(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		
		System.out.println("roll no : "+rollno);
		System.out.println("Name : "+name);
	}
	
	
	
	public static void main(String[] args) {
	
		Student s = new Student();
		
		s.details(101, "prasenjit", 95.40f);
		s.details(102, "Peter");
		
		
	}
}
