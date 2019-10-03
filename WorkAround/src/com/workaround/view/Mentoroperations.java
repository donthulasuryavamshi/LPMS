package com.workaround.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mentoroperations {

	public void viewAllMentors() {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		try (
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");)
		{
			PreparedStatement ps = con.prepareStatement("select * from mentors");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.printf(
						    String.format("  |%5d",rs.getInt(1))+
						"|"+String.format("  |%5s",rs.getString(2))+
						"|"+String.format("  |%5d",rs.getInt(3))+
						"|"+String.format("  |%5s",rs.getString(4))+
						"|"+String.format("  |%5s",rs.getString(5))
						);//+"  |  "+rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
