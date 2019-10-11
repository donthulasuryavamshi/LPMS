package com.virtusa.view;

import java.util.Scanner;

public class MainLoginView {

	public static void main(String[] args) {
		MainLoginView.menu();
	}
	public static void menu() {
		System.out.println("===============================");
		System.out.println("==========LOGIN MENU===========");
		System.out.println("     LOGIN as ADMIN            ");
		System.out.println("     LOGIN as LP               ");
		System.out.println("     LOGIN as MENTOR           ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1:
			//LoginView l = new LoginView();
			LoginView.Menu();
			break;
		case 2:
			//LpLoginView lpLoginView = new LpLoginView();
			//LpLoginView.menu();
			break;
		case 3:
			//MentorLoginView mentorLoginView = new MentorLoginView();
			//MentorLoginView.menu();
			break;
		default:
			System.out.println("select an valid option to proceed!!");
			MainLoginView.menu();
		}
		sc.close();
	}
}
