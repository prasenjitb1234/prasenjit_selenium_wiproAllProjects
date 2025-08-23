package Collection_Framework;

import java.util.ArrayList;

public class MergeTwoArrayListAndRemoveDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);
		nums1.add(50);

		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(10);
		nums2.add(20);

		nums2.add(40);
		nums2.add(50);
		nums2.add(3);

		for (Integer num : nums2) {
			if (!nums1.contains(num)) {
				nums1.add(num);
			}
		}

		System.out.println("Merged List without duplicates: " + nums1);
	}
}
