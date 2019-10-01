package com.workaround.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import com.virtusa.login.Login;
import com.workaround.view.AdminView;

public class LoginAuth {

	public void  auth(String username, String pasword) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
		){
			PreparedStatement ps = con.prepareStatement("select * from LPADMINAuth where username=? and pasword=?");
			ps.setString(1, username);
			ps.setString(2, pasword);
			int result = ps.executeUpdate();
			if(result==1) {
				System.out.println("your authenticated");
				AdminView av = new AdminView();
				av.viewmenu();
			}else {
				System.out.println("you eneterd invalid username or pasword");
				Login.loginview();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
