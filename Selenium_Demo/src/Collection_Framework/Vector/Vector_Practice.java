package Collection_Framework.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Practice {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4, "Gray");
		v.add(null);
		v.add("Black");
		System.out.println(v);
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0, 3));

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		System.out.println(v.contains("Blue"));

		System.out.println(v.capacity());
		
		

		v.setElementAt("Red", 2);
		System.out.println(v);
		
		// iterating all elements in a vector
		Iterator itr = v.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
