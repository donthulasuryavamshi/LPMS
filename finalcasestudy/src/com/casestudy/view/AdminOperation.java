package com.casestudy.view;
import java.util.Scanner;
import com.casestudy.controller.AdminController;
import com.casestudy.controller.FrontController;
import com.casestudy.services.Logout;
public class AdminOperation {
	AdminController ac = new AdminController();
	//public AdminOperation ao = null;//this has thrown null pointer
	public void viewmenu() {
		//System.out.println("entered");
		try(Scanner sc = new Scanner(System.in)){
		System.out.println(" 1. enroll onboradin lp details");
		System.out.println(" 2. view my profile ");
		System.out.println(" 3. view mentors ");
		System.out.println(" 4. view batch details");
		System.out.println(" 5. view training venue");
		System.out.println(" 6. logout");
		int option = sc.nextInt();
		AdminOperation ao = new AdminOperation();
		switch(option) {
		
		case 1:
			ac.enrollLP();
			
			ao.viewmenu();
			break;
		case 2:
			//AdminController ac= new AdminController();
			ac.profileView();
			//AdminOperation ao = new AdminOperation();
			ao.viewmenu();
			break;
		case 3:
			ac.viewMentor();
			ao.viewmenu();
			break;
		case 4:
			ac.viewBatchDetails();
			ao.viewmenu();
			break;
		case 5: 
			ao.viewmenu();
			break;
		case 6:
			Logout lo = new Logout();
			lo.logoutService();
			break;
		default:
			System.out.println("inavlid option input please choose a right option:");
			AdminOperation av = new AdminOperation();
			av.viewmenu();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}