package control_statement_practice;

public class Nested_if_stmt_hall_tickit {
	public static void main(String[] args) {

//		boolean isReg = true;
//		boolean hasHallTickit = false;
//
//		if (isReg) {
//			System.out.println("You can write your exam");
//			if (hasHallTickit) {
//				System.out.println("You can write your exam");
//
//			} else {
//				System.out.println("You need a hall tickit");
//			}
//		} else {
//			System.out.println("You are not registered ");
//		}
		
		boolean isReg = true;
		boolean hasHallTickit = true;
		
		if(isReg) {
			if(hasHallTickit) {
				System.out.println("You can write your exam");
			}
			else {
				System.out.println("You need hall tickit");
			}
		}
		else {
			System.out.println("You are not registered");
		}
		
		
		
		

	}
}
