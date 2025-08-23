package Map_Collections;

import java.util.LinkedHashMap;

//	It Follows Insertion Order 
//Maintains insertion order (keys are iterated in the order they were inserted)
// No Duplicate Elements Allowed It will Override value of that key
// Store Null key ( Only One Null Key Allowed)
// Elements Stored On BAsis of key
//Performance is slightly slower than HashMap (because it maintains a linked list for order)
//Not synchronized (use Collections.synchronizedMap if needed for thread safety)

public class LinkedHashMapDemo {
	public static void main(String[] args) {

		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("one", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Ten", "Muskmelon");
		map.put("Five", "Watermelon");
		map.put(null, "Nothing");
		map.put(null, null);
		map.put("Nine", "CusturdApple"); // Replace

		System.out.println(map);
		System.out.println(map.get("Three"));

		map.replace("Nine", "Kiwi");
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

		System.out.println(map.containsKey("Five"));

		System.out.println(map.get("Nine"));

		System.out.println(map.size());
		
		

	}
}
