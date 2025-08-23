package Encapsulation_Practice;

public class Book {

	protected String title = "Wings of Fire";
	protected String author = "Abdul kalam";

	private boolean isAvailable = true;

	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("You borrowed the book.");
		} else {
			System.out.println("Book is already borrowed.");
		}
	}

	public void returnBook() {
		isAvailable = true;
		System.out.println("Book returned.");
	}

	public void checkAvailability() {
		System.out.println("Available: " + isAvailable);
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.checkAvailability();
		b.borrowBook();
		b.checkAvailability();
		b.returnBook();
		b.checkAvailability();
	}
}
