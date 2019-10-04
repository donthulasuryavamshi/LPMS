package com.casestudy.view;
import java.util.Scanner;
import com.casestudy.controller.AdminController;
import com.casestudy.controller.FrontController;
import com.casestudy.services.Logout;
public class AdminOperation {
	public void viewmenu() {
		try(Scanner sc = new Scanner(System.in)){
			
		System.out.println(" 1. enroll onboradin lp details");
		System.out.println(" 2. view mentors ");
		//System.out.println(" 3. view ");
		System.out.println(" 4. view batch details");
		System.out.println(" 5. view training venue");
		System.out.println(" 6. logout");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			AdminController ac = new AdminController();
			ac.enrollLP();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5: 
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