package com.casestudy.view;
import java.util.Scanner;
import com.casestudy.controller.AdminController;
import com.casestudy.controller.FrontController;
import com.casestudy.services.Logout;
public class AdminOperation {
	AdminController ac = new AdminController();
	//public AdminOperation  = null;//this has thrown null pointer
	public void viewmenu() {
		//System.out.println("entered");
		//int option = 0;
		try{
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1. enroll onboradin lp details");
		System.out.println(" 2. view my profile ");
		System.out.println(" 3. view mentors ");
		System.out.println(" 4.view lpdetails ");
		System.out.println(" 5. view batch details");
		System.out.println(" 6. view training venue");
		System.out.println(" 7. logout");
		if(sc.hasNextInt()) {
			AdminOperation ao = new AdminOperation();
		int option = sc.nextInt();
		//}
		switch(option) {
		
		case 1:
			ac.enrollLP();
		//	Pichi p = new Pichi();
			//p.menu();
			ao.viewmenu();
			break;
		case 2:
			//AdminController ac= new AdminController();
			ac.profileView();
			//AdminOperation ao1 = new AdminOperation();
			ao.viewmenu();
			break;
		case 3:
			ac.viewMentor();
			//AdminOperation ao2 = new AdminOperation();
			ao.viewmenu();
			break;
		case 4:
			ao.viewmenu();
			break;
		case 5:
			ac.viewBatchDetails();
			//AdminOperation ao3 = new AdminOperation();
			ao.viewmenu();
			break;
		case 6:
			//AdminOperation ao5 = new AdminOperation();
			ao.viewmenu();
			break;
		case 7:
			Logout lo = new Logout();
			lo.logoutService();
			break;
		default:
			System.out.println("inavlid option input please choose a right option:");
			AdminOperation av = new AdminOperation();
			av.viewmenu();
		}
		}else {
			System.out.println("heree");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}