package control_statement_practice.assignment;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Its a Leap Year");
		}
		else {
			System.out.println("Its not a leap year ");
		}
		
		
		
	}
}
