package control_statement_practice;

public class if_else_if_bill_category {
	public static void main(String[] args) {

//		write a program to calculate bill category based on units used
//		* units<100-->"Low usage"
//		* 100-299-->"Medium usage"
//		* 300-499-->"High usage"
//		* 500+-->"Very high usage"*/

		float units = 85.4f;

		if (units < 100) {
			System.out.println("Low usage");
		} else if (units >= 100 && units <= 299) {
			System.out.println("Medium usage");
		} else if (units >= 300 && units <= 499) {
			System.out.println("High usage");
		} else {
			System.out.println("Very high usage");
		}
		
		

	}
}
