package com.casestudy.services;
import com.casestudy.controller.LoginController;
import com.casestudy.dao.AdminLoginAuthDao;
import com.casestudy.dao.AdminProfileDao;
import com.casestudy.dao.LPRegisterDao;
import com.casestudy.dao.MentorViewDao;
import com.casestudy.model.LPRegisterModel;
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
	public void lpDetails(LPRegisterModel lprm) {
		LPRegisterDao lprd = new  LPRegisterDao();
		lprd.lpDetailsFilling(lprm);
	}
	public void profileViewServices() {
		AdminProfileDao ap = new AdminProfileDao();
		ap.viewMyProfile();
	}
	public void viewMentors() {
		MentorViewDao mv = new MentorViewDao();
		mv.viewMentorsListDao();
	}
}