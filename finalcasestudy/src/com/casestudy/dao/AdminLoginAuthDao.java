package com.casestudy.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AdminLoginAuthDao {
	public boolean adminLoginVerification(String username, String password) throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		try(
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr"); 
				){
			PreparedStatement ps = con.prepareStatement("select username , pasword from adminlogin where username=? and pasword=?");
			ps.setString(1, username);
			ps.setString(2, password);
			int result = ps.executeUpdate();
			if(result==1) { 
				//System.out.println("login succesfull");
				return true;
			}else {
				//System.out.println("authentication failed");
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
