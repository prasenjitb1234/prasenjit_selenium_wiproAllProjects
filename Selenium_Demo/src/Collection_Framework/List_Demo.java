package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Demo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add(0, "Apple");
		list.add(1, "Mango");
		list.add(2, "Kiwi");
		list.add(3, "Banana");
		System.out.println(list);

		System.out.println(list.get(3));

		list.set(2, "Orange"); // replace current element

		System.out.println(list);

		list.add(3, "Kiwi"); // add element on particular index

		System.out.println(list);

		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana")); // false

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		System.out.println(list.indexOf("Kiwi"));

		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);

		System.out.println(list.reversed());

		// using Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using ListIterator
		Iterator<String> itrs = list.listIterator();
		while (itrs.hasNext()) {
			System.out.println(itrs.next());
		}

		
//		---------------Program 2 -----------
		
		// Add Group of Elements with List Interface method "of"
		ArrayList<Integer> list1 = new ArrayList<>(List.of(50, 70, 10, 80, 20, 40));

		Collections.sort(list1);
		System.out.println(list1);

	}

}
