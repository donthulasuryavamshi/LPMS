package com.casestudy.services;
import java.sql.SQLException;
import com.casestudy.controller.AdminController;
import com.casestudy.dao.AdminLoginAuthDao;
import com.casestudy.view.AdminLoginView;
public class AdminServices {
	AdminServices as = new AdminServices();
	public void LoginView() {
		AdminLoginView alv = new AdminLoginView();
		alv.loginForm();
	}
	public boolean adminAuth(String username, String password) { //  throws ClassNotFoundException, SQLException {
		AdminLoginAuthDao alad = new AdminLoginAuthDao();
		try {
			boolean res = alad.adminLoginVerification(username,password);
			if(res) {
				as.loginSuccessMessage();
				return true;
			}else {
				as.loginUnSuccessMessage();
				return false;
			} 
		}catch (ClassNotFoundException | SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
	public void loginSuccessMessage() {
		System.out.println("authenticated successfully");
	}
	public void loginUnSuccessMessage() {
		System.out.println("unsuccessful authentication");
	}
}