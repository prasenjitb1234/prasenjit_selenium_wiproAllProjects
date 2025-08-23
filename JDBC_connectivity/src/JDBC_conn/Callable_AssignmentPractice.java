package JDBC_conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable_AssignmentPractice {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "12345";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            
            CallableStatement cst = con.prepareCall("{call addbonus01(?)}");
            cst.setInt(1, 5000);
            int rowsUpdated = cst.executeUpdate();
            System.out.println("Bonus added to " + rowsUpdated + " employees.\n");

            // Step 2: Print employees with the same name
            CallableStatement cst1 = con.prepareCall("{call getsamenameemployees()}");
            ResultSet rs1 = cst1.executeQuery();
            System.out.println("Employees with Same Name:");
            System.out.println("Name\t\tEmployee IDs\t\tCount");
            System.out.println("--------------------------------------------------");
            boolean found = false;
            while (rs1.next()) {
                found = true;
                String name = rs1.getString("empname");
                String ids = rs1.getString("emp_ids");
                int count = rs1.getInt("count_names");
                System.out.printf("%-10s\t%-15s\t%d\n", name, ids, count);
            }
            if (!found) {
                System.out.println("No employees with duplicate names found.");
            }

            // Step 3: Print highest and lowest salary
            CallableStatement cst2 = con.prepareCall("{call gethighlow()}");
            ResultSet rs2 = cst2.executeQuery();
            if (rs2.next()) {
                System.out.println("\nHighest Salary: " + rs2.getInt("maxsal"));
                System.out.println("Lowest Salary: " + rs2.getInt("minsal"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
