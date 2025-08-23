package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * public int compareTo(Student s) { 
	 * return id - s.id; // sort by id
	 *  }
	 * 
	 */

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name); // sort by name
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>(
				Arrays.asList(new Student(9, "Amit"), new Student(0, "Rahul"), new Student(2, "Kiran")));

		Collections.sort(list); // sorts by name

//        System.out.println("Sorted List (by name): " + list); 

		for (Student s : list) {
			System.out.println(s);
		}
	}
}
