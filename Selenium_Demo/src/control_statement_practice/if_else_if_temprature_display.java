package control_statement_practice;

public class if_else_if_temprature_display {
	public static void main(String[] args) {
//		*write a program to check temperature and display message like
//		* 40c --> "Very hot
//		* 30-40c-->HOt
//		* 20-29c-->warm
//		* 10-19c-->Cool
//		* <10c-->very cool

		float temp = 35.8f;

		if (temp >= 40) {
			System.out.println("Very Hot");
		} else if (temp >= 30 && temp < 40) {
			System.out.println("Hot");
		} else if (temp >= 20 && temp < 29) {
			System.out.println("Warm");
		} else if (temp >= 10 && temp < 19) {
			System.out.println("Cool");
		} else{
			System.out.println("Very Cool");
		}
		

	}
}
