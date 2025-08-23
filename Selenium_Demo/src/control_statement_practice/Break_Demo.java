package control_statement_practice;

public class Break_Demo {
	public static void main(String[] args) {

//		for(int i=1;i<=1000;i++) {
//			System.out.println(i);
//			if(i==100) {
//				break;
//			}
//		}

//		continue demo --> continue is used to skip using a certain condition

		for (int i = 1; i <= 10; i++) {

			if (i == 5 || i==7 || i==1 || i==3) {
				continue;

			}
			System.out.println(i);
		}

	}
}
