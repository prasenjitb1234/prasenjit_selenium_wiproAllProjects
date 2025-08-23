package File_Handling.Paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("sample1.txt");

		// create File

		Files.createFile(path);
		System.out.println("File created");

		// copy File

		Path copypath = Paths.get("Samplecopy.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");

		// move File
		Path movedPath = Paths.get("movedfile.txt");
		Files.move(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Moved. ");

		// Delete File

		Files.deleteIfExists(path);
		Files.deleteIfExists(movedPath);
		System.out.println("Files Deleted ");

	}
}
