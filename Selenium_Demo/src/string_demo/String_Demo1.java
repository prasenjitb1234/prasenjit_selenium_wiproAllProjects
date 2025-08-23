package string_demo;

public class String_Demo1 {
	public static void main(String[] args) {
		
		// count vowels in String
		String str = "Java Programming";

		int count = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}

		System.out.println("Vowel count : " + count);
		
		
		
		

	}
}
