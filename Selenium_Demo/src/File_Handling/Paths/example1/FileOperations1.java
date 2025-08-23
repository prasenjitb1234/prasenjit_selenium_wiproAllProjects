package File_Handling.Paths.example1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileOperations1 {
	public static void main(String[] args) throws IOException {

		// wap to write data into a file using Files.write() and append
		// using StandardOpenOption.APPEND

		Path path = Paths.get("hello.txt");

		// create

		Files.createFile(path);
		System.out.println("File created");

		// write in a file

		Files.write(path, "This is sample first line ".getBytes());

		System.out.println("Successfylly wrote in file. ");

		Files.write(path, "Appended Lines. ".getBytes(), StandardOpenOption.APPEND);

	}
}
