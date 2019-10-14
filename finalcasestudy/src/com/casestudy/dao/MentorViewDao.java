package com.casestudy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.virtusa.dbconnection.DataBaseConnector;

public class MentorViewDao implements MentorView  {
	public void viewMentorsListDao() {
		Connection con;
		try {
			con = DataBaseConnector.initilizConnection();
			PreparedStatement ps = con.prepareStatement("select * from mentordetails ");
			ResultSet rs = ps.executeQuery();
			//System.out.println("in dao......");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  |"+rs.getString(2)+"  |"+rs.getString(3)+"  |"+rs.getDate(4)+"  |"+rs.getInt(5)+"  |"+rs.getString(6)+"  |"+rs.getString(7)+"  |"+rs.getString(8));
		}
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}
}
