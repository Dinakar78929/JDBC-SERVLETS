package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class MovieRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "system";
		// Connection connection=DriverManager.getConnection(url,userName,password);

		try (Connection connection = DriverManager.getConnection(url, userName, password);) {

			System.out.println("Connection build succesfully");
			Statement statement = connection.createStatement();
			String query1 = "insert into movie values(1,'KGF','NEEL')";
			String query2 = "insert into movie values(2,'RRR','MOULI')";
			String query3 = "insert into movie values(3,'PICHAIKARAN','VIJAY')";
			String query4 = "insert into movie values(4,'MAARI','DHANUSH')";
			String query5 = "insert into movie values(5,'MANKATHA','AJITH')";
			String query6 = "insert into movie values(6,'POLLADAVAN','MARAN')";
			String query7 = "insert into movie values(7,'VADACHENNAI','MARAN')";
			String query8 = "insert into movie values(8,'ASURAN','MARAN')";
			String query9 = "insert into movie values(9,'ADUKALAM','MARAN')";
			String query10 = "insert into movie values(10,'JHOGI','SHIVU')";
			String query11 = "insert into movie values(11,'TAJ MAHAL','PREM')";

			// String deleteQuery="delete from movie where work_id=7";
			// String updateQuery="update movie set movieName='JHONJANARDAN' where
			// Sno='11'";
			// boolean i=st.execute(query);
			// ResultSet i=statement.executeQuery(updateQuery);

			Collection<String> queries = new ArrayList<String>();
			queries.add(query1);
			queries.add(query2);
			queries.add(query3);
			queries.add(query4);
			queries.add(query5);
			queries.add(query6);
			queries.add(query7);
			queries.add(query8);
			queries.add(query9);
			queries.add(query10);
			for (String string : queries) {
				int i = statement.executeUpdate(string);

				if (i != 0) {
					System.out.println("Data Inserted succesfully");
				} else {
					System.err.println("Data Insertion failed");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Connection colsed succesfully");
		}

	}

}
