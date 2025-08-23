package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write_file {
	public static void main(String[] args) {

		try {

			BufferedWriter w = new BufferedWriter(
					new FileWriter("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\sample.txt"));

			w.write("Hello");
			w.newLine();
			w.write("Welcome to Java Learning");
			w.close();
			System.out.println("Writen Successfully in File");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
