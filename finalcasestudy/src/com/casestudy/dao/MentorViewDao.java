package com.casestudy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MentorViewDao {
	public void viewMentorsListDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try (
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
				){
			
			PreparedStatement ps = con.prepareStatement("select * from mentors ");
			ResultSet rs = ps.executeQuery();
			//System.out.println("in dao......");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  |"+rs.getString(2)+"  |"+rs.getString(3)+"  |"+rs.getDate(4)+"  |"+rs.getInt(5)+"  |"+rs.getString(6)+"  |"+rs.getString(7)+"  |"+rs.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
