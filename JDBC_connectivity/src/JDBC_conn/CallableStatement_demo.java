package JDBC_conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement_demo {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "12345";

		try (Connection con = DriverManager.getConnection(url, user, password)) {

			CallableStatement cst = con.prepareCall("{CALL getStudentBymark00(?)}");
			
			cst.setInt(1, 92);
			// 

			System.out.println("Result from getStudentBymark00 (with mark 92):");
			System.out.println("ID\tName\t\t\tMarks");
			System.out.println("------------------------------------");

			ResultSet rs = cst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int marks = rs.getInt("marks");
				System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
			}
			
			System.out.println("\n ******  ----- End of first Callable statement *****------**** ");

			rs.close();
			cst.close();

			System.out.println();

			// asceding order studentlist

			CallableStatement cst1 = con.prepareCall("{CALL getStudentByMarkAsc00()}");

			ResultSet rs1 = cst1.executeQuery();

			System.out.println("Result from getStudentByMarkAsc00 (Ascending):");
			System.out.println("ID\tName\t\t\tMarks");
			System.out.println("------------------------------------");

			while (rs1.next()) {
				int id = rs1.getInt("id");
				String name = rs1.getString("name");
				int marks = rs1.getInt("marks");
				System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
			}
			rs1.close();
			cst1.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}