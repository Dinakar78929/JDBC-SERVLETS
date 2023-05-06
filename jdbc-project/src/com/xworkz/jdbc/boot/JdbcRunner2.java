package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcRunner2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");

		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "system";
		String query = "select * from work";
		Connection con = DriverManager.getConnection(url, userName, password);
		java.sql.Statement st = con.createStatement();
		ResultSet set = st.executeQuery(query);
		
		set.next();
		
		System.out.println("Work_id:"+set.getInt(1));
		System.out.println("Work Name:"+set.getString(2));
		System.out.println("Worker Name:"+set.getString(3));
		con.close();
		System.out.println("Connection closed Succesfully");
	}
}
