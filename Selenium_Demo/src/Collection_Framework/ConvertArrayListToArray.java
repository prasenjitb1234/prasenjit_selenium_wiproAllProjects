package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
	public static void main(String[] args) {
		
		// convert arrayList to array
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Prasenjit");
		name.add("Peter");
		name.add("Tony");
		name.add("Wanda");
		name.add("Nobita");
		
		String arr[] = name.toArray(new String[0]);
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		
	}
}
