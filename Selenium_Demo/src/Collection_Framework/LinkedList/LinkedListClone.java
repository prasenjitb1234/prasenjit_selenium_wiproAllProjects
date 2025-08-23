package Collection_Framework.LinkedList;

import java.util.LinkedList;

public class LinkedListClone {
	public static void main(String[] args) {

		// create a Linked list of numbers
//		clone it using clone method();
		// print original and cloned list

		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		

		System.out.println("Main List : " + list1);
		System.out.println("Cloned List : " + list1.clone());

		
		
		
		
	}
}
