package control_statement_practice;

public class ScholarShip_Check {
	public static void main(String[] args) {
		
		/*check if a student is eligible for a scholarship
		* 1. a student must have score above 80 or must be from reserved category
		*
		* output=Scholarship granted or
		* not eligible for the scholarship*/
		
		
		int score = 90;
		boolean isReservedCategory = true;
		
		if(score >= 80 || isReservedCategory) {
			System.out.println("Scholarship is granted");
		}
		else {
			System.out.println("Not eligible for thsi scholarship");
		}
		
		 
		
	}
}
