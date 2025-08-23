package control_statement_practice;

public class StudentEligibility {
	public static void main(String[] args) {

		/*
		 * write a java program using if -else stmt that checks a person's eligibility
		 * for entry an discount offers based on the following condition 1. the person
		 * must be 18 years or older and must have an id card to be allowed entry 2.the
		 * person gets a student discount if they are under 18 or if they are a student
		 */

		int age = 16;
		boolean hasIdCard = true;
		boolean isStudent = true;

		if (age >= 18 && hasIdCard) {
			System.out.println(age + " : You are adult so allowed entry.");
		}

		if (age < 18 || isStudent) {
			System.out.println("You are eligible for student discount.");
		} else {
			System.out.println("You are not eligible for student discount.");
		}
	}
}
