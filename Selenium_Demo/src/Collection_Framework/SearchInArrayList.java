package Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("List: " + list);

		System.out.println("Enter target: ");
		int target = sc.nextInt();

		int low = 0;
		int high = list.size() - 1;

		boolean status = false;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (list.get(mid) == target) {
				System.out.println("Target found at index: " + mid);
				status = true;
				break;
				
			}
			else if (list.get(mid) < target) {
				low = mid + 1;
				
			} else
			{
				high = mid - 1;
			}
		}

		if (status == false) {
			System.out.println("Element not found ");
		}
		
		// actually all this shi+ can be optimized by using list methods -->no need to use binary search
		

	}
}
