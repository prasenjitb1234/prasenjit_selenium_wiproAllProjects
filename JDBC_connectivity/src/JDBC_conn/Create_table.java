package JDBC_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {

	public static void main(String[] args) {

		// Database credentials
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "12345";

		// SQL Queries
		String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" + "rollno INT, " + "name VARCHAR(50), "
				+ "per INT, " + "email VARCHAR(50))";

		String insertSQL = "insert into students values " 
				+ "(101, 'Neeva Sharma', 98, 'abc@gmail.com'),"
				+ "(102, 'Reeva Sharma', 89, 'Reeva@gmail.com')," 
				+ "(103, 'Samay Raina', 79, 'samay@gmail.com'),"
				+"(104, 'Peter Parker', 75, 'peter@gmail.com'),"
				+"(105, 'Prasenjit B', 80, 'prasenjit@gmail.com')";
		
		String updateSQL = "update students set per = 99 where rollno = 102";
		

		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connnection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Connection created successfully");

			// create statement for executing queries
			Statement stmt = con.createStatement();

			// create table 
			// stmt.executeUpdate(createTableSQL);
			System.out.println(" Students table is created");

			// Insert records
			int rowInserted = stmt.executeUpdate(insertSQL);
			if (rowInserted > 0) {
				System.out.println(" New student records inserted successfully");
			}
			
			// update record 
//			int updateRecord = stmt.executeUpdate(updateSQL);
//			System.out.println("Record Updated Successfully !");
			

			// fetch and display details
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			System.out.println("\nRoll No\tName\t\tPercentage\tEmail");
			System.out.println("------------------------------------------------");

			while (rs.next()) {
				int rollno = rs.getInt("rollno");
				String name = rs.getString("name");
				int per = rs.getInt("per");
				String email = rs.getString("email");

				System.out.println(rollno + "\t" + name + "\t" + per + "\t\t" + email);
			}

			// Close resources
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
