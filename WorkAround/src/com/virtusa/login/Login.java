package com.virtusa.login;

import java.util.Scanner;

import com.workaround.auth.LoginAuth;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Login.loginview();
	}
	public static void  loginview() {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("enter username");
			String username = sc.next();
			System.out.println("enter password");
			String pasword = sc.next();
			if(username!=null && pasword!=null) {
				LoginAuth la = new LoginAuth();
				la.auth(username,pasword);
			}else {
				System.out.println("invalid username or pasword please try again");
				Login.loginview();
			}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
