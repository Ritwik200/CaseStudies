package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInDept {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
			
			Statement stmt = con.createStatement();
			String s = "Insert into dept values('14','Engineering','India');";
			String s1 = "Insert into dept values('12','Service','Japan');";
			stmt.execute(s);
			stmt.execute(s1);
			con.close();
			System.out.println("Data updated");
		
	}

}
