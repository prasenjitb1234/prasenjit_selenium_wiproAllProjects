package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Assignment {
	 public static void main(String[] args) throws SQLException {

	        String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String password = "12345";

	        // create table 
	        String createTable = "create table if not exists student (" 
	                + "rollno int primary key, " 
	                + "name varchar(50), "
	                + "marks int, " 
	                + "city varchar(50))";

	        // insert into student
	        String insertSQL = "insert into student (rollno, name, marks, city) values" 
	                + "(101,'Prasenjit Bhosale',70,'Mumbai'),"
	                + "(102,'Peter Parker',92,'Pune')," 
	                + "(103,'Samay Raina',88,'Mumbai'),"
	                + "(104,'Tanmay Bhat',91,'Bangalore'),"
	                + "(105,'Micheal Scott',89,'Pune')";

	        // create institute 
	        String createInstitute = "create table if not exists institute (" 
	                + "rollno INT PRIMARY KEY, "
	                + "institute_name VARCHAR(50))";

	        // insert into institut
	        String insertInstitute = "insert into institute (rollno, institute_name) VALUES " 
	                + "(101, 'Mumbai University'),"
	                + "(102, 'SPPU')," 
	                + "(103, 'Mumbai University')," 
	                + "(104, 'DU'),"
	                + "(106, 'Shivaji University')";


	        // update record
	        String updateSQL = "UPDATE student SET marks = 78 WHERE rollno = 101";

	        // highest marks among all
	        String highestPer = "Select max(marks) from student";

	        // arrange ascending 
	        String ArrangeRecords = "select * from student order by marks asc";

	        // same city students
	        String sameCitySQL = "select city, GROUP_CONCAT(name SEPARATOR ', ') as students "
	                + "FROM student GROUP BY city HAVING COUNT(*) > 1";

	        //
	        
	        // join
	        
	        
	        
	        
	        
	        // innrer join
	        String innerJoin = "SELECT * from student inner join institute ON "
	        		+ "student.rollno = institute.rollno";
	        
//	        // left join
	        String leftJoin = "select * from student left join institute on"
	        		+ " student.rollno = institute.rollno";
	        
//	        right join
	        String rightJoin = "select * from student right join institute on"
	        		+ " student.rollno = institute.rollno";
	        
	        
	        // full join - union
	        String fullOuterJoin = "select * from student left join institute on student.rollno = institute.rollno "
	                + "union "
	                + "select * from student right join institute on student.rollno = institute.rollno";

	        
	        
	        
	        
	        // Age column 
	        String addAgeColumn = "ALTER TABLE student ADD COLUMN age INT";
	        
	        String modifyAgeColumn = "ALTER TABLE student MODIFY COLUMN age FLOAT";
	        
	        String deleteAgeColumn = "ALTER TABLE student DROP COLUMN age";

	        
	        
	        
	        
	        
	        try {
	        	// load driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            // create connection 
	            
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("Connection created Successfully");

	            Statement stmt = con.createStatement();

	            // create student table
	            stmt.executeUpdate(createTable);
	            System.out.println("student table created successfully");

	            // create institute table
	            stmt.executeUpdate(createInstitute);
	            System.out.println("institute table created successfully");



	            // insert into student table
	            int rowInserted = stmt.executeUpdate(insertSQL);
	            if (rowInserted > 0) {
	                System.out.println("new RecordS added to  student");
	            }

	            // insert into institute table
	            int rowInserted2 = stmt.executeUpdate(insertInstitute);
	            if (rowInserted2 > 0) {
	                System.out.println("new record added  into institute");
	            }

	            // fetch all students
	            ResultSet rs = stmt.executeQuery("Select * from student");
	            System.out.println("\nAll Student Records: \n");
	            System.out.println("Roll No\t Name\t Marks\t City \n");
	            System.out.println("-----");
	            while (rs.next()) {
	                System.out.println(rs.getInt("rollno") + "\t" 
	                        + rs.getString("name") + "\t" 
	                        + rs.getInt("marks") + "\t" 
	                        + rs.getString("city"));
	            }
	            rs.close();

	            // update record
	            int updateRecord = stmt.executeUpdate(updateSQL);
	            if (updateRecord > 0) {
	                System.out.println("\n student Record updated Successfully");
	            }

	            // highest marks
	            ResultSet rs2 = stmt.executeQuery(highestPer);
	            if (rs2.next()) {
	                int highestMarks = rs2.getInt(1);
	                System.out.println("\n Maximum marks- percent among all  students is : " + highestMarks);
	            }
	            rs2.close();

	            // arrange students
	            ResultSet rs3 = stmt.executeQuery(ArrangeRecords);
	            System.out.println("\nArrange records Ascending:");
	            System.out.println("Roll No\tName\tMarks\tCity");
	            System.out.println("-------------------------------------");
	            while (rs3.next()) {
	                System.out.println(rs3.getInt("rollno") + "\t" 
	                        + rs3.getString("name") + "\t" 
	                        + rs3.getInt("marks") + "\t" 
	                        + rs3.getString("city"));
	            }
	            rs3.close();



	         // same city students
	            ResultSet rs4 = stmt.executeQuery(sameCitySQL);
	            System.out.println("\nStudents belonging to the same city:");
	            System.out.println("City\t\tStudents");
	            System.out.println("-------------------------------------");
	            while (rs4.next()) {
	                System.out.println(rs4.getString("city"));
	                System.out.println(rs4.getString("students"));
	                System.out.println();
	            }
	            rs4.close();
	            
	            
	            

	            // inner join
	            ResultSet rs5 = stmt.executeQuery(innerJoin);
	            System.out.println("\nINNER JOIN :");
	            System.out.println("rollno\tname\tmarks\tcity\tinstitute_name");
	            System.out.println("------------------------------------------------------");
	            while (rs5.next()) {
	                System.out.println(rs5.getInt("rollno") + "\t" 
	                        + rs5.getString("name") + "\t" 
	                        + rs5.getInt("marks") + "\t" 
	                        + rs5.getString("city") + "\t" 
	                        + rs5.getString("institute_name"));
	            }
	            rs5.close();

	            // left join
	            ResultSet rs6 = stmt.executeQuery(leftJoin);
	            System.out.println("\nLEFT JOIN (All Students, with institute if available):");
	            System.out.println("rollno\t name\t  marks \tcity  \t  institute_name");
	            System.out.println("------------------------------------------------------");
	            while (rs6.next()) {
	                System.out.println(rs6.getInt("rollno") + "\t" 
	                        + rs6.getString("name") + "\t" 
	                        + rs6.getInt("marks") + "\t" 
	                        + rs6.getString("city") + "\t" 
	                        + rs6.getString("institute_name"));
	            }
	            rs6.close();

	            // right join
	            ResultSet rs7 = stmt.executeQuery(rightJoin);
	            System.out.println("\nRIGHT JOIN ");
	            System.out.println("rollno\tname\tmarks\tcity\tinstitute_name");
	            System.out.println("------------------------------------------------------");
	            while (rs7.next()) {
	                System.out.println(rs7.getInt("rollno") + "\t"
	                        + rs7.getString("name") + "\t"
	                        + rs7.getInt("marks") + "\t"
	                        + rs7.getString("city") + "\t"
	                        + rs7.getString("institute_name"));
	            }
	            rs7.close();

	            // outer join full union
	            ResultSet rs8 = stmt.executeQuery(fullOuterJoin);
	            System.out.println("\nFULL OUTER JOIN ");
	            System.out.println("rollno\tname\tmarks\tcity\tinstitute_name");
	            System.out.println("------------------------------------------------------");
	            while (rs8.next()) {
	                System.out.println(rs8.getInt("rollno") + "\t"
	                        + rs8.getString("name") + "\t"
	                        + rs8.getInt("marks") + "\t"
	                        + rs8.getString("city") + "\t"
	                        + rs8.getString("institute_name"));
	            }
	            rs8.close();
	            
	            
//	            ------
	            // new column age added 
	            stmt.executeUpdate(addAgeColumn);
	            System.out.println("\n\n Column age added .");  // age column added. 

	            stmt.executeUpdate(modifyAgeColumn);
	            System.out.println(" Column age datatype changed from int to float .");  // first it was int ,, float 
	            //delete 
	            stmt.executeUpdate(deleteAgeColumn);
	            System.out.println(" Column age deleted successfully.");  // deteled age column
	            
	            
	            

	            stmt.close();
	            con.close();

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}

//INSERT INTO staff (username, password, role) VALUES ('admin', 'admin123', 'Admin');

