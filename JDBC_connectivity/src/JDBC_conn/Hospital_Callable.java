package JDBC_conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hospital_Callable {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "12345";

		try (

			Connection con = DriverManager.getConnection(url, user, password)) {

// 			average Patient daily count

			System.out.println("\n Daily Average Patient Count");
			CallableStatement cst1 = con.prepareCall("{call dailyavgpatient01()}");
			ResultSet rs1 = cst1.executeQuery();
			System.out.println("Date \t\t Patients");
			System.out.println("-------------------------");
			while (rs1.next()) {
				System.out.println(rs1.getDate("admissiondate") + "\t" + rs1.getInt("patient_count"));
			}

			rs1.close();
			cst1.close();

//			patient who have same name in ward 

			System.out.println(" Patients in the Same Ward ");
			CallableStatement cst2 = con.prepareCall("{call samewardpatients01()}");
			ResultSet rs2 = cst2.executeQuery();
			System.out.println("Ward\t Patient");
			System.out.println("-------------------------");
			while (rs2.next()) {
				System.out.println(rs2.getString("ward") + "\t" + rs2.getString("patientname"));
			}

			rs2.close();
			cst2.close();

//			sort patients ascending date 
			System.out.println(" Patients by Admission Date ");
			CallableStatement cst3 = con.prepareCall("{call sortbyadmissiondate01()}");
			ResultSet rs3 = cst3.executeQuery();
			System.out.println("ID\t Name\t\t Ward\t Date");
			System.out.println("-------------------------");
			while (rs3.next()) {
				System.out.println(rs3.getInt("patientid") + "\t" + rs3.getString("patientname") + "\t\t"
						+ rs3.getString("ward") + "\t" + rs3.getDate("admissiondate"));
			}

			rs3.close();
			cst3.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
