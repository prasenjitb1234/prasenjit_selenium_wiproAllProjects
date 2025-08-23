package File_Handling.Seriealization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Se_data {
	public static void main(String[] args) throws IOException {
		
		Student s1 = new Student(101,"Neeva Sharma");
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Serialization Done Successfully !");
		
		
	}
}
