package File_Handling.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Emp_De {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("employee.class");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee emp1 = (Employee) ois.readObject();

		emp1.display();

		ois.close();
		fis.close();
		System.out.println("Deserialization done successfully");

	}
}
