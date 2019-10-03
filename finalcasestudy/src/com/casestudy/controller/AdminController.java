package com.casestudy.controller;
import java.sql.SQLException;

import com.casestudy.services.AdminServices;
public class AdminController {
	public void LoginView() {
		AdminServices ls = new AdminServices();
		ls.LoginView();
	}
	public void authValidation(String username, String password) {//  throws ClassNotFoundException, SQLException {
		AdminServices as = new AdminServices();
		boolean result = as.adminAuth(username,password);
		if(result==true) {
			
		}else {
			
		}
	}
}