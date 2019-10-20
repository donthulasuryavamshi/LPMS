package com.virtusa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.helper.FactoryAdminService;
import com.virtusa.model.LpRegistrationModel;

/**
 * Servlet implementation class LPRegistration
 */
@WebServlet("/LPRegistration")
public class LPRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private FactoryAdminService factoryService;
    public LPRegistration() {
    	this.factoryService=FactoryAdminService.createUpdateProfileDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int lpid = Integer.parseInt(request.getParameter("sid"));
		String lpname = request.getParameter("sname");
		String lpdesignation = request.getParameter("sid");
		int lpphonenumber = Integer.parseInt(request.getParameter("sid"));
		String lpaddress = request.getParameter("sid");
		String lpemail = request.getParameter("email");
		LpRegistrationModel lpregistationmodel = new LpRegistrationModel();
		 lpregistationmodel.setLpid(lpid);
		 lpregistationmodel.setLpname(lpname);
		 lpregistationmodel.setDesignation(lpdesignation);
		 lpregistationmodel.setContact(lpphonenumber);
		 lpregistationmodel.setEmail(lpemail);
		 lpregistationmodel.setAddress(lpaddress);
		 PrintWriter out = response.getWriter();
		 FactoryService factoryService = new FactoryServiceImpl();
		 factoryService.registerLpDetails(lpregistationmodel);
		
		
		
		
	}

}
