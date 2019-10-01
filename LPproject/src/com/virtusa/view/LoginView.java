package com.virtusa.view;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

import com.virtusa.controller.MainController;

public class LoginView {
	public static LoginView lv = new LoginView();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LoginView lv = new LoginView();
		lv.Menu();
	}
		
	public void Menu(){
		try {
			//InputStreamReader reader=new InputStreamReader(System.in);
			//BufferedReader buffer=new BufferedReader(reader);
			Scanner sc=new Scanner(System.in);
		System.out.println("welcome to the login portal!!");
		System.out.println("entre your credentials to login:");
		//System.out.println("type 1 or 2 or 3");
		//int type = Integer.parseInt(buffer.readLine());
		System.out.println("username:");
		String Username =sc.next(); //buffer.readLine();
		System.out.println("password");
		String Password = sc.next();//buffer.readLine();
		sc.close();
	if(Username!= null && Password!=null) {
		MainController mainControl = new MainController();
		//System.out.println("one");
		mainControl.Authenticate(Username,Password);
	}else {
			System.out.println("invalid entry of username or password!!!");
			lv.Menu();
		}
		//System.out.println("two");
		}catch(Exception e) {
			System.out.println("check exeception at loginView page!!");
			e.printStackTrace();
		}
		
	}
	
	
}

