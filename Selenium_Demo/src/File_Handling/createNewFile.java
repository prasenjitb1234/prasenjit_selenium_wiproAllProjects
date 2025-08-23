package File_Handling;

import java.io.File;

public class createNewFile {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling/hello.txt");
		
		try {
			f.createNewFile(); // create new file on particular location
			System.out.println(f.setWritable(true));
		}
		catch(Exception e) {
			System.out.println("File not found");
			System.out.println(e);
		}
	}
}
