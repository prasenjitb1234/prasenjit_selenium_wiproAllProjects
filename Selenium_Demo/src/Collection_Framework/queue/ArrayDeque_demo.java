package Collection_Framework.queue;

import java.util.ArrayDeque;

// Array Dequeue is double ended queue -> we can insert from both ends 
// we can add duplicate elements inside Dequeue and ArrayDequeue

public class ArrayDeque_demo {
	public static void main(String[] args) {

		ArrayDeque<String> q = new ArrayDeque<>();

		q.add("Apple"); //  1
		q.add("Mango");
		q.add("Watermelon");
		q.add("Kiwi");
		System.out.println(q);

		System.err.println(q.getFirst());

		System.out.println(q.getLast());

		q.offer("Banana");
		System.out.println(q);

		q.offerFirst("Muskmelon"); // insert element at first position
		q.offerLast("Orange"); // insert element at last position
		System.out.println(q);

		System.out.println(q.peek());

		q.poll(); // poll is used to remove first element which is Apple 
		
		System.out.println(q);
		
	

	}
}
