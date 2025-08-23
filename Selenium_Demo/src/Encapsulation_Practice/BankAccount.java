package Encapsulation_Practice;

public class BankAccount {

	private double balance = 0;

	public void deposite(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("Deposited : " + amt);
		}
	}

	private void withdraw(double amt) {
		if (amt > 0 && amt <= balance) {
			balance -= amt;

			String amtStr = String.valueOf(amt);
			String masked = "";

			for (int i = 0; i < amtStr.length(); i++) {
				char ch = amtStr.charAt(i);
				if (Character.isDigit(ch)) {
					masked += "*";
				} else {
					masked += ch;
				}
			}

			System.out.println("Withdraw amount : " + masked);

		} else {
			System.out.println("Invalid amount");
		}
	}

	private double getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

		acc.deposite(50000);
		acc.withdraw(10000);

		System.out.println("Balance: " + acc.getbalance());
	}
}
