package File_Handling.serializable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Serial_data {
	public static void main(String[] args) {

//		Employee emp = new Employee(101, "Prasenjit Bhosale");
//		Employee emp1 = new Employee(102,"Peter Parker");
//		Employee emp2 = new Employee(103,"Ben Tennyson");

		Employee emp = new Employee();
		emp.setEmpDetails(101, "Prasenjit Bhosale");

		Employee emp1 = new Employee();
		emp1.setEmpDetails(102, "Peter Parker");

		Employee emp2 = new Employee();
		emp2.setEmpDetails(103, "Ben Tennyson");

		try {

			FileWriter fw = new FileWriter("employee.txt");
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(emp.toString());
			bf.newLine();

			bf.write(emp1.toString());
			bf.newLine();

			bf.write(emp2.toString());
			bf.newLine();

			bf.close();
			fw.close();
			System.out.println("Done");
			
			
			
//			System.out.println("Employee Data from File:");
//            BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();
			

		} catch (IOException e) {
			System.out.println("Failed");
			System.out.println(e);
		}

	}

}
