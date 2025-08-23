package Array_Practice;

public class Two_D_Demo2 {
	public static void main(String[] args) {
		
		
		int num1 = 0;
		int num2 = 1;
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum = num1 + num2;
			System.out.println(sum+" ");
			num1 = num2;
			num2 = sum;
			
		}
		
		
		
	}
}
