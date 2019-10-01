package com.virtusa.view;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.LPAddController;
import com.virtusa.models.LPAddModel;
//import com.virtusa.controller.MainController;
//import com.virtusa.controller.ViewLpController;
//import java.io.Reader;
//import com.virtusa.sesrvices.LPAddService;
//import com.virtusa.sesrvices.LPAddService;

public class AdminView {

	public void adminMenuOptions() {
		System.out.println("Hello Admin Welcome back!!");
		System.out.println("choose the options from the below panel.......");
		System.out.println("====================================================");
		System.out.println("1. enroll LP to batch");
		System.out.println("2. view Lp");
		System.out.println("3. view Mentors");
		System.out.println("4. view Training Venues");
		System.out.println("5. logout");
		System.out.println("====================================================");
		try{
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			Scanner sc = new Scanner(System.in);
			int option =sc.nextInt(); //Integer.parseInt(br.readLine());
			switch(option) {
			
			case 1:
				//System.out.println("step 1");
				AdminView lrv = new AdminView();
				lrv.LpRegistrationForm();
				
				break;
			
			case 2:
				LPAddController lac = new LPAddController();
				lac.viewLPDetails();
				break;
			
			case 3:
				break;
			
			case 4: 
				break;
			case 5:
				LogoutView lov = new LogoutView();
				lov.LogoutMessage();
				break;
			
			default:
				System.out.println(" please enter a valid option!!");
			}
			sc.close();
		}catch(Exception e) {
			System.out.println(" error in admin view option panel");
			e.printStackTrace();
		}
}
	public void LpRegistrationForm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("Add onboarding Lp details here:");

		System.out.print("LP Id");
		int LpId=sc.nextInt();

		System.out.print("LP FirstName:");
		String LpFirstName=sc.next();

		System.out.print("LP LastName:");
		String LpLastName=sc.next();

		System.out.print("Student Email:");
		String LpEmail=sc.next();

		System.out.print("LP PhoneNumber:");
		String LpPhoneNumber=sc.next();
		
		LPAddModel lpAddModel=new LPAddModel();
		//System.out.println("step 2-1"+ lpAddModel);
		lpAddModel.setLpId(LpId);
		lpAddModel.setLpfirstName(LpFirstName);
		lpAddModel.setLplastName(LpLastName);
		lpAddModel.setLpemail(LpEmail);
		lpAddModel.setLpphoneNumber(LpPhoneNumber);

		LPAddController lpAddController=new LPAddController();
		//System.out.println("step 2 -2 "+ lpAddModel);
		lpAddController.storeLpDetails(lpAddModel);//may happen
sc.close();
	}
	public void storeSuccessful(){
		
		System.out.println("Student registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Student registered unsuccessful");
	}
	public void lpDetailsView(List<LPAddModel> lpModel) {
		//for(LPAddModel lpDetails: lpModel) {
			//System.out.println(lpDetails);
		//}
		lpModel.forEach(System.out::println);
	}

}
