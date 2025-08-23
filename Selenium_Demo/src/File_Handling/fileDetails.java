package File_Handling;

import java.io.File;

public class fileDetails {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\sample.txt");

		if (f.exists()) {
			System.out.println("File name : " + f.getName());
			System.out.println("File Location : " + f.getAbsolutePath());
			System.out.println("File Size : " + f.length());
			System.out.println("File Readable : " + f.canRead());
			System.out.println("File Writable : " + f.canWrite());
		} else {
			System.out.println("File Not Found");
		}

	}
}
