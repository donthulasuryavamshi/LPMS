package com.virtusa.view;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

import com.virtusa.controller.MainController;

public class LoginView {
	//public static LoginView lv = new LoginView();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LoginView lv = new LoginView();
		Menu();
	}

	public static void Menu() {
		try {
			// InputStreamReader reader=new InputStreamReader(System.in);
			// BufferedReader buffer=new BufferedReader(reader);
			Scanner sc = new Scanner(System.in);
			System.out.println("welcome to the login portal!!");
			System.out.println("entre your credentials to login:");
			// System.out.println("type 1 or 2 or 3");
			// int type = Integer.parseInt(buffer.readLine());
			System.out.println("username:");
			//if(sc.hasNext())
				String Username = sc.next(); // buffer.readLine();
			System.out.println("password");
			//if(sc.hasNext())	
				String Password = sc.next();// buffer.readLine();
//			sc.close();
			if (Username != null && Password != null) {
				MainController mainControl = new MainController();
				// System.out.println("one");
				mainControl.Authenticate(Username, Password);
			} else {
				System.out.println("invalid entry of username or password!!!");
				Menu();
				
			}
		sc.close();
			// System.out.println("two");
		} catch (Exception e) {
			System.out.println("check exeception at loginView page!!");
			e.printStackTrace();
		}

	}

}
