package control_statement_practice;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age >= 18) 
		{
			System.out.println("You Are Eligible for Voting");
		}
		else {
			System.out.println("You Are Not Eligible for Voting ! ");
		}
		System.out.println("End Program");
		
		
	}
}
