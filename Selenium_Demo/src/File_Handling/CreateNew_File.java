package File_Handling;

import java.io.File;

public class CreateNew_File {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling/sample.txt");
		
		try {
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch(Exception e) {
			System.out.println("File Not Found");
			System.out.println(e);
		}
		
	}
}
