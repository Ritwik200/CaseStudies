package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertInSalgrade {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		
		Statement stmt = con.createStatement();
		String s = "Insert into Salgrade values('6','4000','10000');";
		String s1 = "Insert into Salgrade values('12','5000','12000');";
		stmt.execute(s);
		stmt.execute(s1);
		con.close();
		System.out.println("Data updated");
	}

}
