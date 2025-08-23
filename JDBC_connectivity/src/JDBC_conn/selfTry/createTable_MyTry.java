package JDBC_conn.selfTry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable_MyTry {
	public static void main(String[] args) throws ClassNotFoundException {
	
	
	// Database credentials
    String url = "jdbc:mysql://localhost:3306/mydb";
    String user = "root";
    String password = "12345";
    
		
 // SQL Queries defined outside try block
    String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
            + "rollno INT, "
            + "name VARCHAR(50), "
            + "per INT, "
            + "email VARCHAR(50))";

    String insertSQL = "INSERT INTO students VALUES "
//    		+ "(101, 'Neeva Sharma', 98, 'abc@gmail.com'),"
//    		+ "(102,'Reeva Verma',85,'def@gmail.com')",
    		+ "(103,'Peter Parker',85,'ghi@gmail.com')";
    			
		
    try {
        // Load  Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println(" Connection Created");

        // create statement for query execution
        Statement stmt = con.createStatement();

        // Execute table creation
        stmt.executeUpdate(createTableSQL); 
        System.out.println(" Students table created successfully");

        // Insert record
        int rowInserted = stmt.executeUpdate(insertSQL);
        if (rowInserted > 0) {
            System.out.println(" New student record inserted successfully");
        }

        // Fetch and display records
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        System.out.println("\nRoll No\tName\t\tPercentage\tEmail");
        System.out.println("------------------------------------------------");

        while (rs.next()) {
            int rollNo = rs.getInt("rollno");
            String name = rs.getString("name");
            int percentage = rs.getInt("per");
            String email = rs.getString("email");

            System.out.println(rollNo + "\t" + name + "\t" + percentage + "\t\t" + email);
        }

        // Close resources
        rs.close();
        stmt.close();
        con.close();

    } catch (SQLException e) {
        System.out.println(e);
    }	
		
		
	}
}
