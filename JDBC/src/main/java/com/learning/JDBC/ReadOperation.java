package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
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
				    String query = "SELECT * FROM REGISTRATION";
				    ResultSet result = stmt.executeQuery(query);
				    
				    while(result.next()){
				    	System.out.println("ID :"+result.getInt("id"));
				    	System.out.println("Name :"+result.getString("name"));
				    	System.out.println("Age :"+result.getInt("age"));
				    }
				    
				    
				    
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


	}

}
