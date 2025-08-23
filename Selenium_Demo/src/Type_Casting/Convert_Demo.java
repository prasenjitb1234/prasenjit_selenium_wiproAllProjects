package Type_Casting;

public class Convert_Demo {
	public static void main(String[] args) {

		// widening  -> converting smaller type to larger type

		int num = 10;
		System.out.println("Value of num = " + num);

		float d = num;
		System.out.println("Value of d = " + d);

		// narrowing -> manually converting larger type to smaller type
		int a = (int) d;

		System.out.println("Value of a = " + a);
		
//		char c = 'a';
//		int b = (int) c;
//		System.out.println(b);

	}
}
