package Collection_Framework.set;

import java.util.HashSet;
import java.util.Iterator;


// unordered
// No duplicate Elements Allowed 
// we can store only 1 null value
// Elements Stored on basis of Hash code values


public class Hash_set {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		
		set.add("Maggie");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		
		set.add("Water");
		set.add("Water");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		
		System.out.println(set.contains("Pasta"));
		set.remove("Water");
		System.out.println(set);
		
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());
		
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
