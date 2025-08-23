package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile_Demo {
	public static void main(String[] args) throws IOException {

		
		BufferedReader r = new BufferedReader(
				new FileReader("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.txt"));

		List<String> lines = new ArrayList<>();
		
		String line;
		
		while((line = r.readLine()) != null) {
			lines.add(line);
		}
		
		for(String l : lines) {
			System.out.println(l);
		}
		

	}
}
