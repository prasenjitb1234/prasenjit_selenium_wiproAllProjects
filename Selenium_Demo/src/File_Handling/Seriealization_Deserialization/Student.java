package File_Handling.Seriealization_Deserialization;

import java.io.Serializable;

public class Student implements Serializable {

	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	void display() {
		System.out.println("Roll No: " + rollno + "    " + " Name : " + name);
	}

}
