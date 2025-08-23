package Wrapper_Classes;

public class Auto_Demo {
	public static void main(String[] args) {

		// Autoboxing (Convert Primitive to Wrapper Classes )

		int num = 10;
		System.out.println(num);
		Integer num1 = num; // Convert Primitive to Wrapper Class
		System.out.println("Wrap Data : " + num1);

		// Unboxing (Convert Wrapper to Primitive)

		Integer a = 20;
		System.out.println("for object : " + a);
		int b = a; // Unboxing (Object to Primitive)
		System.out.println("For Primitive Data Type to int : " + b);

		String str = "12345";
		int ab = Integer.parseInt(str);
		System.out.println(ab);

		String n = Integer.toString(num);
		System.out.println(n);

		//
		char ch = '1';
		if (Character.isDigit(ch)) {
			System.out.println(ch + " is digit");
		} else {
			System.out.println(ch + "is not digit");
		}

		
		// 
		String str1 = "prasen123";

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);

			if (Character.isDigit(c)) {
				System.out.println(c + " is a Digit");
			} else {
				System.out.println(c + " is NOT a Digit");
			}
		}
		
		
		// 
		
		String str2 = "prasenjit123";

        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < str2.length(); i++) {
            char ch1 = str2.charAt(i);

            if (Character.isDigit(ch1)) {
                digitCount++;
            } else if (Character.isLetter(ch1)) {
                charCount++;
            }
        }

        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Number of Characters: " + charCount);
		
		
		

	}

}
