package File_Handling.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Emp_Se {
	public static void main(String[] args) throws IOException {
		
		Employee emp1 = new Employee(1,"Prasenjit","Developer");
		
		FileOutputStream fos = new FileOutputStream("employee.class");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(emp1);
		
		oos.close();
		fos.close();
		
		System.out.println("Serialization Done Successfully !");
		
	}
}
