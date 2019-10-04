package com.casestudy.controller;
import com.casestudy.services.LoginService;
public class FrontController {
  public void loginview() {
	  LoginService ls = new LoginService();
	  ls.loginViewService();
  }
}