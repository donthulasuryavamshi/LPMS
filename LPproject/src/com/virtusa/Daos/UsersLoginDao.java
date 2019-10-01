package com.virtusa.Daos;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.users;
import com.virtusa.repository.UserAuth;
import com.virtusa.view.AdminView;

public class UsersLoginDao {

	private List<users> userLoginList = null;

	public UsersLoginDao() {
		//System.out.println(" step 5 check control");
		this.userLoginList=UserAuth.getUserAuth();
	}
	
	
	public boolean userAuth(String userName, String password) {
		//System.out.println(" step 10 control check  "+userName + password);
		// TODO Auto-generated method stub
		boolean result=false;
		
		for(users user:userLoginList) {
			
			if(user.getUserName().equals(userName)) {
				
				if(user.getPassword().equals(password)) {
					AdminView av = new AdminView();
					av.adminMenuOptions();
										
				}
				
			}
	
		}
		return result;
	}
}
