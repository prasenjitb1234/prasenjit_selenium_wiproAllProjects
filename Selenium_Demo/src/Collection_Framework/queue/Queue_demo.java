package Collection_Framework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue orders elements according to natural order (min-heap by default)
// Duplicates allowed 
// Null values not allowed (will throw NullPointerException)

public class Queue_demo {
	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<>();

		q.add("Apple"); // 1
		q.add("Mango"); // 2
		q.add("Watermelon"); // 3
		q.add("Kiwi"); // 4
		q.add("Banana"); // 5
		System.out.println(q); // prints elements (order depends on priority, not insertion)

		System.out.println(q.peek()); // shows head element (alphabetically smallest)

		q.offer("Orange"); // add Orange into the queue
		System.out.println(q);

		q.poll(); // removes the head element (smallest alphabetically)
		System.out.println(q);

		q.remove(); // removes the current head element
		System.out.println(q);

		System.out.println(q.contains("Mango")); // check if Mango exists

		System.out.println("Queue size: " + q.size()); // number of elements

		System.out.println("Is queue empty? " + q.isEmpty()); // check if empty
	}
}
