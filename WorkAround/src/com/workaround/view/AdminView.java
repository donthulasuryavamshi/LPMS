package com.workaround.view;

import java.util.Scanner;

//import com.virtusa.login.Login;

public class AdminView {

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
			EnrollLps enroll = new EnrollLps();
			enroll.lpsEnroll();
			break;
		
		case 2:
			ViewMentors vm = new ViewMentors();
			vm.viewmentorslist();
			break;
		
		case 3:
			break;
		case 4:
			break;
		case 5: 
			break;
		case 6:
			Logout logout = new Logout();
			logout.logoutView();
			break;
		default:
			System.out.println("inavlid option input please choose a right option:");
			AdminView av = new AdminView();
			av.viewmenu();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
