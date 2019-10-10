package com.casestudy.controller;
import java.sql.SQLException;

import com.casestudy.services.AdminServices;
public class AdminController {
	AdminServices as = new AdminServices();
	public void authValidation(String username, String password) {//  throws ClassNotFoundException, SQLException {
		//System.out.println(username + "  "+password );//debugging
		AdminServices as = new AdminServices();
		as.adminAuth(username,password);
		/*if(result==true) {
			AdminOperation ao = new AdminOperation();
			ao.viewmenu();
		}else {
			AdminLoginView alv = new AdminLoginView();
			alv.loginForm();
		}*/
	}
	/*public void LoginView() {
		AdminServices ls = new AdminServices();
		ls.LoginView();
	}
	public void logoutView() {
		Logout lo = new Logout();
		lo.logoutService();
	}*/
	public void enrollLP() {		
		as.enrollService();
	}
	public void profileView() {
		as.profileViewServices();
	}
	public void viewMentor() {
		as.viewMentors();
	}
	public void viewBatchDetails() throws ClassNotFoundException, SQLException {
		as.viewBatches();
	}
}