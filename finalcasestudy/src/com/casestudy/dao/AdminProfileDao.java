package com.casestudy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminProfileDao {
	public void viewMyProfile() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
				) {
			PreparedStatement ps = con.prepareStatement("select * from lp");
			ResultSet rs = ps.executeQuery();
			System.out.println("LP_ID  |  FIRST_NAME |  LAST_NAME | DOB | PHONE_NUMBER | EMAIL | ROLE | BATCH_ID");
			while(rs.next()) {
				System.out.println(rs.getString(1)+ "    | " +rs.getString(2)+ "   | " + rs.getString(3)+"      | "+rs.getString(4)+"     | "+rs.getString(5)+"    | "+rs.getString(6)+"    | "+rs.getString(7)+"    | "+rs.getString(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
