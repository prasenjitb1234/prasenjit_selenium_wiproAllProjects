package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEntireFile {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader r = new BufferedReader(
                new FileReader("C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\sample.txt"))) {

            String line;
            while ((line = r.readLine()) != null) {
                lines.add(line);
            }

            
            for (String l : lines) {
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

// buffer reader, writer, printwriter, file, 
