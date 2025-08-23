package control_statement_practice;

public class if_else_if_stmt_demo1 {
	public static void main(String[] args) {
		
		float per = 87.20f;
		
		if(per >= 75 && per <= 100) {
			System.out.println("Dist");
		}
		else if(per >= 60 && per <75) {
			System.out.println("First Class");
		}
		else if(per >= 50 && per < 60) {
			System.out.println("Second Class ");
		}
		else if(per >= 40 && per < 50) {
			System.out.println("Pass");
		}
		else if(per >= 0 && per < 40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
		
	}
}
