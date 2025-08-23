package control_statement_practice.assignment;

import java.util.Scanner;

public class Assignment1_RegistrationForm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.next();

		System.out.println("Enter your Mobile Nubmer : ");
		long number = sc.nextLong();
		sc.nextLine();  

		System.out.println("Enter your Email Address : ");
		String email = sc.nextLine();  

		System.out.println("Enter your username : ");
		String username = sc.nextLine();

		System.out.println("Enter your Password : ");
		String password = sc.nextLine();
		
		System.out.println("Confirm your password : ");
		String confirmPassword = sc.nextLine();

		System.out.println("Registration Details are ::  ");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("Mobile Nubmer : " + number);
		
		if(password.length() == confirmPassword.length()) {
			if(password.equals(confirmPassword)) {
				System.out.println("Password matches ");
			}
			else {
				System.out.println("Password doesnt match");
			}
		}
		

	}
}
