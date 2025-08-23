package string_demo;

public class StringDemo3 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Welcome");

		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.substring(3, 7));
		System.out.println(sb.delete(4, 7));
		System.out.println(sb.deleteCharAt(2));

	}
}
