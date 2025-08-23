package variable_practice;

public class Employee {

	int empId;
	String empName;
	String empDept;
	float empSalary;
	String empCity;
	static String companyName = "wipro"; // static

	void empDetails(int empId1, String empName1, String empDept1, float empSalary1, String empCity1) {

		empId = empId1;
		empDept = empDept1;
		empSalary = empSalary1;
		empCity = empCity1;

		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name  :" + empName);
		System.out.println("Employee Salary : " + empSalary);
		System.out.println("Employee City : " + empCity);
		System.out.println("Company Name : " + companyName);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		
		System.out.println("");
		obj.empDetails(1, "prasenjit", "Developer", 30000.00f, "Mumbai");
		obj.empDetails(102, "Peter", "QA", 28000.00f, "Bangalore");
		
		
		

	}
}
