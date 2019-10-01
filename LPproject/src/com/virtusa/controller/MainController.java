package com.virtusa.controller;

import com.virtusa.factory.UserLoginFactory;
import com.virtusa.models.UserLoginModel;
import com.virtusa.sesrvices.MainService;
import com.virtusa.view.AdminView;

public class MainController {
	private MainService mainService;
	
	public MainController() {
		//System.out.println(" 1 check mainController");
		this.mainService = UserLoginFactory.createUserLoginService();
	}
	public void Authenticate(String UserName, String Password) {
		//System.out.println("step 8 check authentication  "+UserName + " "+ Password);
		UserLoginModel userModel=new UserLoginModel();
		userModel.setUserName(UserName);
		userModel.setPassword(Password);
		String userType=
				mainService.userAuthenticationService(userModel);
		
		if(userType.contentEquals("ADMIN")) {
			AdminView adminView=new AdminView();
			adminView.adminMenuOptions();
		}
		if(userType.contentEquals("Mentor")){
			
		}
		if(userType.contentEquals("LP")) {
			
		}
		
	}
}
