package com.tns.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.ClassNotFoundException;


public class JDBC {
	
		
		public static final String URL=
				"jdbc:postgresql://localhost:5432/SFBatch";
		
		public static final String USERNAME="postgres";
		public static final String PASSWORD="root";
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
			// step-1 : Loading driver
			
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			//step-2 : connection establishment
			
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			System.out.println("Connection Established");
			
			// step-3 : create the query
			
			String query="select * from student";
			
			// step-4 : create statement
			
			Statement stmt=con.createStatement();
			
			// step-5 : ResultSet
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			}
			
			
			// step-6 : close statement
			
			stmt.close();
			
			// step-7 : close connection
			
			con.close();
			System.out.println("Connection Closed");
			
			
		}

	}



