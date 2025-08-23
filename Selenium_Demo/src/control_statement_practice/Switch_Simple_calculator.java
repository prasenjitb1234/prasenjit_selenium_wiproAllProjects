package control_statement_practice;

public class Switch_Simple_calculator {
	public static void main(String[] args) {
		// addition , subtraction, multiplication, division

		int a = 40;
		int b = 20;

		String operation = "+";

		switch (operation) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		default:
			System.out.println("Invalid input");
		}

	}
}
