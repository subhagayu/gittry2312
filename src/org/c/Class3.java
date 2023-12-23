package org.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Class3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			String s= "Select * from employees";
			PreparedStatement ps = con.prepareStatement(s);
			ResultSet query = ps.executeQuery();
			while (query.next()) {
				String name = query.getString("first_name");
				System.out.println(name);
				int salary = query.getInt("salary");
				System.out.println(salary);
			}
		 
		
		

		
	
	
	
	
	
	}
}




