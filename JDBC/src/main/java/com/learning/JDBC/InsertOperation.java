package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
    public static final String url ="jdbc:mysql://localhost:3306/jdbcconcept";
    public static final String username = "root";
    public static final String password  = "root";

	public static void main(String[] args) {
		//fully qualified name
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager
		    		.getConnection(url,username ,password );
		
		    Statement stmt = con.createStatement();
		    String sql1 ="INSERT INTO REGISTRATION VALUES(1,'ANKIT',26)";
		    stmt.executeUpdate(sql1);
		    
		    String sql2 ="INSERT INTO REGISTRATION VALUES(2,'Harsh',18)";
		    stmt.executeUpdate(sql2);
		    
		    String sql3 ="INSERT INTO REGISTRATION VALUES(3,'Vinay',24)";
		    stmt.executeUpdate(sql3);
		    
		    System.out.println("Data added successfully...");
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
