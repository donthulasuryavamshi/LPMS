package com.casestudy.view;
import java.util.Scanner;
import com.casestudy.controller.AdminController;
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
			AdminLoginView alv = new AdminLoginView();
			alv.loginForm();
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