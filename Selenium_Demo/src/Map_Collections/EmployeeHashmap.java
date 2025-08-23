package Map_Collections;

import java.util.HashMap;

public class EmployeeHashmap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Prasenjit");
		hm.put(2, "Peter");
		hm.put(3,"Ben");
		hm.put(4, "Tom");
		hm.put(5, "Nobita");
		hm.put(null, null);
		
		System.out.println(hm);
		System.out.println(hm.get(4));
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(2));
		
		
	}
}	
