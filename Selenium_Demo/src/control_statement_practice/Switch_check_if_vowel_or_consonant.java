package control_statement_practice;

public class Switch_check_if_vowel_or_consonant {
	public static void main(String[] args) {

		char ch = 'a';

		ch = Character.toLowerCase(ch);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			if (Character.isLetter(ch)) {
				System.out.println("Consonant");
			} else {
				System.out.println("Not an alphabet character");
			}
		}
	}
}
