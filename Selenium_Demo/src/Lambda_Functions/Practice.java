package Lambda_Functions;

import java.util.function.Predicate;

public class Practice {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(7));
		
		
		
		
		
	}
	
	
}
