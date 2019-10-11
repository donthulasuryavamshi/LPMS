package com.casestudy.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.casestudy.services.AdminServices;
import com.casestudy.services.LoginService;
import com.virtusa.dbconnection.DataBaseConnector;
public class AdminLoginAuthDao {
	//public AdminServices as = new AdminServices();
	public void adminLoginVerification(String username, String password) {
		try {
		Connection con = DataBaseConnector.initilizConnection();
		PreparedStatement ps = con.prepareStatement("select admin_id , admin_password from adminlogin where admin_id=? and admin_password=?");
		ps.setString(1, username);
		ps.setString(2, password);
		//System.out.println("connected"+username+password);
		ResultSet result = ps.executeQuery();
		if(result.next()) { 
			//System.out.println("login succesfull");
			LoginService as = new LoginService();
			as.loginSuccessMessage();
			//LoginController lc = new LoginController();
			//lc.adminLoginSuccessful();
			//return true;
		}else {
			//System.out.println("authentication failed");
			LoginService as = new LoginService();
			as.loginUnSuccessMessage();
		//	LoginController lc = new LoginController();
		//	lc.adminLoginUnSuccessful();
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			/*try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try(
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr"); 
				)
		{
			PreparedStatement ps = con.prepareStatement("select admin_id , admin_password from adminlogin where admin_id=? and admin_password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			//System.out.println("connected"+username+password);
			int result = ps.executeUpdate();
			if(result==1) { 
				//System.out.println("login succesfull");
				LoginService as = new LoginService();
				as.loginSuccessMessage();
				//LoginController lc = new LoginController();
				//lc.adminLoginSuccessful();
				//return true;
			}else {
				//System.out.println("authentication failed");
				LoginService as = new LoginService();
				as.loginUnSuccessMessage();
			//	LoginController lc = new LoginController();
			//	lc.adminLoginUnSuccessful();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}
}
