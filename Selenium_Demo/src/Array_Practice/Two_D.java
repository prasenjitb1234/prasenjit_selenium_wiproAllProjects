package Array_Practice;

public class Two_D {
	public static void main(String[] args) {

//			col  0  1   2
		int[][] arr = { 
				{ 10, 20 }, // row 0
				{ 30, 40, 50 }, // row 1
				{ 60 } // row2
		};

//		System.out.println(arr[1][2]);
		
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();  // move to next line after each row
		}

		

	}
}
