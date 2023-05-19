package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class IPLRunner {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "system";
		// Connection connection=DriverManager.getConnection(url,userName,password);

		try (Connection connection = DriverManager.getConnection(url, userName, password);) {

			System.out.println("Connection build succesfully");
			Statement statement = connection.createStatement();
			String query1 = "insert into ipl values(1,'GT','RoyalBlue')";
			String query2 = "insert into ipl values(2,'RCB','Red')";
			String query3 = "insert into ipl values(3,'CSK','Yello')";
			String query4 = "insert into ipl values(4,'DD','Blue')";
			String query5 = "insert into ipl values(5,'SRH','Orange')";
			String query6 = "insert into ipl values(6,'KKR','Violet')";
			String query7 = "insert into ipl values(7,'LSG','greenBlue')";
			String query8 = "insert into ipl values(8,'PBKS','Pink')";
			String query9 = "insert into ipl values(9,'RR','pink+Blue')";
			String query10 = "insert into ipl values(10,'MI','LightBlue')";
			String query11 = "insert into ipl values(11,'RCP','LightBlue')";

			// String deleteQuery="delete from ipl where work_id=7";
			String updateQuery="update ipl set TeamName='GL' where Sno='11'";
			// boolean i=st.execute(query);
			 //ResultSet i=statement.executeQuery(updateQuery);

			Collection<String> queries = new ArrayList<String>();
			//queries.add(query11);
			//for (String string : queries) {
				int i = statement.executeUpdate(updateQuery);

				if (i != 0) {
					System.out.println("Data Inserted succesfully");
				} else {
					System.err.println("Data Insertion failed");
				}
			//}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Connection colsed succesfully");
		}

	}

}
