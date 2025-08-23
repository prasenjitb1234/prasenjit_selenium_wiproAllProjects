package File_Handling.Seriealization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_data {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       
            
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

         
            Student s1 = (Student) ois.readObject();

            
            s1.display();

            
            ois.close();
            fis.close();
            System.out.println("Deserialization done successfully");
            
        }
            
        
    }

