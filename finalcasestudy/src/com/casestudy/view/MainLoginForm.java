package com.casestudy.view;
import java.util.Scanner;

import com.casestudy.controller.FrontController;
import com.casestudy.dao.AdminProfileDao;
import com.sun.istack.internal.logging.Logger;
public class MainLoginForm {
	public static void main(String[] args) {
		menu();
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
			FrontController fc = new FrontController();
			fc.loginview();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("select an valid option to proceed!!");
			MainLoginForm.menu();
		}
		sc.close();
	}
}