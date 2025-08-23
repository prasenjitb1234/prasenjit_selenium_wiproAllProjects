package Array_Practice;

public class Single_Array {
	public static void main(String[] args) {

		// find out second highest number out of 10 numbers && also second highest 

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int max = arr[0];

		int secondmax = arr[0];
		
		
		// max element 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		
		System.out.println("Max Element is : " + max);

		// second max element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max && arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}

		System.out.println("Second Max Element is : " + secondmax);

	}
}
