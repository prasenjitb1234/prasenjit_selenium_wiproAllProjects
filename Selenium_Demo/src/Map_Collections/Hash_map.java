package Map_Collections;

import java.util.HashMap;

public class Hash_map {

	// unordered
	// No Duplicate Elements Allowwed It will Override value of that key
	// Store Null key ( Only One Null Key Allowed)
	// Elements Stored On BAsis of key

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
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
