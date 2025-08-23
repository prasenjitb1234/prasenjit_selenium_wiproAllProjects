package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileAllOperationsDemo {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\prasenjit.txt");

		try {
			
			// create file
			f.createNewFile();
			System.out.println(f.setWritable(true));
			System.out.println("File Created Successfully!");

			// file info

			System.out.println("File Name: " + f.getName());
			System.out.println("File Location : " + f.getAbsolutePath());
			System.out.println("File Size: " + f.length());
			System.out.println("Readable: " + f.canRead());
			System.out.println("Writable: " + f.canWrite());

			// write file

			BufferedWriter w = new BufferedWriter(
					new FileWriter("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\prasenjit.txt"));

			w.write("Hello ");
			w.newLine();
			w.write("India is my country. ");
			w.close();
			System.out.println("Successfully Wrote in a File");

			// read file

			BufferedReader r = new BufferedReader(
					new FileReader("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\prasenjit.txt"));

			List<String> lines = new ArrayList<String>();

			String line;

			while ((line = r.readLine()) != null) {
				lines.add(line);
			}
			for (String l : lines) {
				System.out.println(l);
			}
			
			

		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

	}
}
