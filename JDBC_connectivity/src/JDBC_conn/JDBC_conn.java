package JDBC_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_conn {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "12345";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Created");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from emp");

		System.out.println("ID\t NAME\t Salary");

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");

			System.out.println(id + " " + name + " " + salary);

		}

		rs.close();
		stmt.close();

		con.close();

	}
}
