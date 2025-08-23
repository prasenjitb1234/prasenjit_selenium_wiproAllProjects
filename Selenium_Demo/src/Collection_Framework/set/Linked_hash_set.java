package Collection_Framework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

// Linked Hash set follows Insertion order

//No duplicate Elements Allowed 
//we can store only 1 null value
//Elements Stored on basis of Hash code values

public class Linked_hash_set {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();

		set.add("Maggie");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");

		set.add("Water");
		set.add("Water");
		set.add(null);
		set.add(null);

		System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		
		System.out.println(set.isEmpty());
		System.out.println("First Element : "+set.getFirst());
		System.out.println("Lst Element : "+set.getFirst());
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}
