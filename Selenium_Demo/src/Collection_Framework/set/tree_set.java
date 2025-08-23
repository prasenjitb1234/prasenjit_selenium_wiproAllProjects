package Collection_Framework.set;

import java.util.TreeSet;

//Tree set follows Increasing Order (Alphabetical Order) 

//No duplicate Elements Allowed 
//Null Not Allowed
//Elements Stored on basis of Hash code values

public class tree_set {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("Maggie");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");

		set.add("Water");
		set.add("Water");
		
		set.add("Yippie");
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		
		System.out.println(set);
		
		
		System.out.println(set.ceiling("Waters")); // next
		System.out.println(set.floor("Waters")); // previous
		
		System.out.println(set.higher("Salt"));
		System.out.println(set.lower("Salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set.descendingSet());
		System.out.println();
		
		
		
		
		

	}

}
