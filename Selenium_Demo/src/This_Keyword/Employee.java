package This_Keyword;

public class Employee {

	int empId;
	String empName, empRole, empCompany;
	float empSalary;

	
	void display(Employee e) {
		System.out.println("Displaying Employee Info using current object:");
		System.out.println("Emp Id : " + e.empId);
		System.out.println("Emp Name : " + e.empName);
		System.out.println("Emp Role : " + e.empRole);
		System.out.println("Emp Company Name : " + e.empCompany);
		System.out.println("Emp Salary : " + e.empSalary);
	}


	void setDetails(int empId, String empName, String empRole, String empCompany, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.empCompany = empCompany;
		this.empSalary = empSalary;

		display(this); // passed current object
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setDetails(101, "Prasenjit", "Developer", "Wipro", 30000.00f);
	}
}
