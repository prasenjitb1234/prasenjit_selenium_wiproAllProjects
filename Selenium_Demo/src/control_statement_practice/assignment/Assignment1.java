package control_statement_practice.assignment;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		// check if number is even or odd using if else
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		
	}
}
