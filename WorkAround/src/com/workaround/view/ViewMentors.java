package com.workaround.view;

import java.util.Scanner;

public class ViewMentors {


	public void viewmentorslist() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" 1. view all mentors");
		System.out.println(" 2. search mentor by name");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:Mentoroperations mo = new Mentoroperations();
				mo.viewAllMentors();
			break;
		case 2:
			break;
		default:
			System.out.println("invalid selection of option plz select again");
			ViewMentors vm=new ViewMentors();
			vm.viewmentorslist();
		}
		sc.close();
		
	}
}
