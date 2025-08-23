package control_statement_practice;

public class if_else_eligiblity_demo {
	public static void main(String[] args) {
		
		/* write a java program using if -else stmt that checks a person's eligibility for entry an
		discount offers based on the following condition
		1. the person must be 18 years or older and must have an id card to be allowed entry
		2.the person gets a student discount if they are under 18 or if they are a student*/
		
		int age = 20;
		boolean hasIdCard = true;
		
		if(age >= 18 && hasIdCard == true) {
			System.out.println("You are elibile for Entry !");
		}
		
		boolean isStudent = true;
		
		if(age < 18 || isStudent) {
			System.out.println("You are eligible for student discount");
		}
		System.out.println("You are not eligible for studnet discount");
		
		
	}
}
