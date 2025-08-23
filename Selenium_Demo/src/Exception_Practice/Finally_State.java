package Exception_Practice;

public class Finally_State {
	public static void main(String[] args) {

		try {
			int[] a = new int[4];
			System.out.println(a[6]); // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Important Code");
		}
		System.out.println("End");



	}
}
