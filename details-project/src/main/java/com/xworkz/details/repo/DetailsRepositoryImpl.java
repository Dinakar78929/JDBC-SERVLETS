package com.xworkz.details.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.details.dto.DetailsDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DetailsRepositoryImpl implements DetailsRepository{
	String url="jdbc:mysql://localhost:3306/student";
	String userName="root";
	String password="system";
	
	@Override
	public boolean save(DetailsDTO dto) throws ClassNotFoundException {
		int count=0;

		Class.forName("com.mysql.jdbc.Driver");
			try(Connection connection=DriverManager.getConnection(url, userName, password)){
				
				String query="insert into details values(?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement=connection.prepareStatement(query);
				preparedStatement.setString(1, dto.getName());
				preparedStatement.setString(2, dto.getQualification());
				preparedStatement.setString(3, dto.getStream());
				preparedStatement.setString(4, dto.getCourse());
				preparedStatement.setString(5, dto.getCollege());
				preparedStatement.setString(6, dto.getCity());
				preparedStatement.setString(7, dto.getState());
				preparedStatement.setString(8, dto.getCountry());
				count=preparedStatement.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		if(count!=0) {
			return true;
		}
		return false;
	}

}


