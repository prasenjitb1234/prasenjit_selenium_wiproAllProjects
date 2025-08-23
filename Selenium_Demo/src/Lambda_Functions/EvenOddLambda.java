package Lambda_Functions;

interface Even {

	boolean isEven(int num);
}

public class EvenOddLambda {
	public static void main(String[] args) {

		Even check = (num) -> num % 2 == 0;
		System.out.println(check.isEven(4));
		System.out.println(check.isEven(1));

	}
}
