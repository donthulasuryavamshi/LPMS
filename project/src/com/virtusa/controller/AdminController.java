package com.virtusa.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.virtusa.helper.FactoryClass;
import com.virtusa.model.LpDetailsModel;
import com.virtusa.service.AdminOperationServices;
@WebServlet
public class AdminController {
	private AdminOperationServices adminOperationservices;
	public AdminController() {
		this.adminOperationservices=
				FactoryClass.createAdminOperationService();
	}

}
