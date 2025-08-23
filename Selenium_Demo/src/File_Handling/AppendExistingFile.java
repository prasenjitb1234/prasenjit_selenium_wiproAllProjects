package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendExistingFile {
	public static void main(String[] args) {
		
		try {
			BufferedWriter w = new BufferedWriter(
					new FileWriter("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\sample.txt",true));
			
			w.write("\nHello");
			w.newLine();
w.write("\nWelcome to Java learning Session ");
w.close();
System.out.println("Succesfully Wrote in File");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
