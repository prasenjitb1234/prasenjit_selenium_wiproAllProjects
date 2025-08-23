package control_statement_practice;

public class Switch_Practice_size_check {
	public static void main(String[] args) {
		
		int size = 36;
		
		switch(size) {
		case 26: System.out.println("Extra Small ");
		break;
		case 28: System.out.println("Small Size");
		break;
		case 30: System.out.println("medium size");
		break;
		case 32: System.out.println("Large size");
		break;
		case 34: System.out.println("Extra large");
		break;
		case 36: System.out.println("Extra extra large ");
		break;
		default:
			System.out.println("Invalid size");
		}
		
		
	}
}
