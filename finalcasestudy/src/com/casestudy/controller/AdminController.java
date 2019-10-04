package com.casestudy.controller;
import com.casestudy.services.AdminServices;
public class AdminController {
	//public AdminServices as ;
	public void authValidation(String username, String password) {//  throws ClassNotFoundException, SQLException {
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
		AdminServices as = new AdminServices();
		as.enrollService();
	}
}