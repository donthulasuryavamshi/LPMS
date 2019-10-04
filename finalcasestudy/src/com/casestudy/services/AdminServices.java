package com.casestudy.services;
import com.casestudy.controller.LoginController;
import com.casestudy.dao.AdminLoginAuthDao;
import com.casestudy.view.LPEnrollmentView;
public class AdminServices {
	public AdminServices as;
	public void  adminAuth(String username, String password) { 
	//public void  adminAuth(String username, String password) { //  throws ClassNotFoundException, SQLException {
		AdminLoginAuthDao alad = new AdminLoginAuthDao();
		try {
			alad.adminLoginVerification(username,password);
			/*if(res==true) {
				as.loginSuccessMessage();
				return true;
			}else {
				as.loginUnSuccessMessage();
				return false;
			} */
		}catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//return false;
	}
	/*public void loginSuccessMessage() {
		//System.out.println("authenticated successfully");
		LoginController lsc = new LoginController();
		lsc.adminLoginSuccessful();
	}
	public void loginUnSuccessMessage() {
		//System.out.println("unsuccessful authentication");
		LoginController lsc = new LoginController();
		lsc.adminLoginUnSuccessful();
	}
	/*public void LoginView() {
		AdminLoginView alv = new AdminLoginView();
		alv.loginForm();
	}*/
	public void enrollService() {
		LPEnrollmentView lpev = new LPEnrollmentView();
		lpev.menu();
	}
}