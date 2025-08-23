package File_Handling.example;

import java.io.Serializable;

public class Employee implements Serializable {

	int empId;
	String empName;
	String empRole;

	Employee(int empId, String empName, String empRole ){
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}

	void display() {
		System.out.println("empId : " + empId + " Emp Name : " + empName + " emp Role : " + empRole);
	}

}
