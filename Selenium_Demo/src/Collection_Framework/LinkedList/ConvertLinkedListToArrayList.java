package Collection_Framework.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
	public static void main(String[] args) {
		
		// Que.  Convert linkedlist to array list
		// WAP  to : 
			// create a linked list of strings
//		convert it into an arraylist
//		display both the linedlist and arrayList 
		
		
		LinkedList<String> str = new LinkedList<>();
		
		str.add("Java");
		str.add("Python");
		str.add("Javascript");
		str.add("C++");
		
		ArrayList<String> arr = new ArrayList<>(str);
		
		System.out.println("Linkedlist : "+str);
		System.out.println("ArrayList : "+arr);
		
		
		
		
		
		
		
	}
}
