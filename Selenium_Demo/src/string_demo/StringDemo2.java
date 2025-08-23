package string_demo;

public class StringDemo2 {
	public static void main(String[] args) {

		String str = "Hello";

		// convert String to StringBuffer or StringBuilder

		StringBuffer sb = new StringBuffer(str);
		sb.append(" Dear");
		System.out.println(sb);

		sb.append("Students");
		System.out.println(sb);

		// convert StringBuffer / StringBuiler to String
		StringBuffer sbb = new StringBuffer("Pune");
		String str1 = new String(sbb);

		System.out.println(str1);

	}
}
