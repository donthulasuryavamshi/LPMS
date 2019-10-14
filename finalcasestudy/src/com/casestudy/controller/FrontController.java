package com.casestudy.controller;
import org.apache.log4j.Logger;

import com.casestudy.services.LoginService;
public class FrontController {
static Logger log = Logger.getLogger(FrontController.class.getName());
  public void loginview() {
	  log.info("entered loginservices");
	  LoginService ls = new LoginService();
	  ls.loginViewService();
  }
}