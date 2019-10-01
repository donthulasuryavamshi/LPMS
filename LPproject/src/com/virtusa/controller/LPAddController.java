package com.virtusa.controller;


import java.util.List;

import com.virtusa.factory.FactoryLpService;
import com.virtusa.models.LPAddModel;
import com.virtusa.sesrvices.LPAddService;
import com.virtusa.view.AdminView;
//import com.virtusa.view.LPsViewList;
//import com.virtusa.view.LpRegisterView;

public class LPAddController {

	private LPAddService lpAddService;
	
	public LPAddController(){
		//System.out.println("step 3");
		
		this.lpAddService=FactoryLpService.createLPServices();
		
	}
	
	public void storeLpDetails(LPAddModel lpAddModel){
		//System.out.println("step 3 - 1"+lpAddModel);
		
		boolean result=lpAddService.storeLpService(lpAddModel);
		AdminView lpregView=new AdminView();
		if(result){
			lpregView.storeSuccessful();
		}else{
			
			lpregView.storeUnSuccessful();
		}
		
	}
	public void viewLPDetails() {
		List<LPAddModel> lpDetailsview = lpAddService.retreieveLPService();
		AdminView av= new AdminView();
		av.lpDetailsView(lpDetailsview);
	}
}
