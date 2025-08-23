package Collection_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {
	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList<>();

		list.add('a');
		list.add('b');
		list.add('c');
		list.addFirst('d');
		list.addLast('z');
		list.add(3,'p');
		
		System.out.println("Size of List : "+ list.size());

		Iterator<Character> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}
}
