package com.xworkz.jdbc.boot;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class JdbcRunner {
	public static void main(String[] args) throws Exception{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "system");
		java.sql.Statement s=c.createStatement();
		s.execute("insert into work values(1,'Destroy','Tailor')");
		c.close();
		System.out.println("Done");
		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver loaded Succesfully");
//
//		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
//		String userName = "root";
//		String password = "system";
//		String query = "select * from work";
//		Connection con = DriverManager.getConnection(url, userName, password);
//		java.sql.Statement st = con.createStatement();
//		ResultSet set = st.executeQuery(query);
//		
//		set.next();
//		
//		System.out.println(set.getInt(1));
//		System.out.println(set.getString(2));
//		System.out.println(set.getString(3));
		

	}

}
