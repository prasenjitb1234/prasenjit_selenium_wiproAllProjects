package File_Handling.Paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_demo {
	public static void main(String[] args) {

		Path path = Paths.get("employee.txt");

		System.out.println("Name of File : " + path.getFileName());
		System.out.println("Absolute Path : " + path.toAbsolutePath());
		System.out.println("Parent Folder : " + path.toAbsolutePath().getParent());

	}
}
