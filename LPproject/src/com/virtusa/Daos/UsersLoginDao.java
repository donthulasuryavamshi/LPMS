package com.virtusa.Daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.List;

//import com.virtusa.entities.users;
//import com.virtusa.login.Login;
//import com.virtusa.repository.UserAuth;
import com.virtusa.view.AdminView;
import com.virtusa.view.LoginView;
public class UsersLoginDao {
  public void  userAuth(String username, String pasword) {
	try {
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
	){
	  PreparedStatement ps = con.prepareStatement("select * from LPADMINAuth where username=? and pasword=?");
	  ps.setString(1, username);
	  ps.setString(2, pasword);
	  int result = ps.executeUpdate();
	  if(result==1) {
		System.out.println("your authenticated");
		AdminView av = new AdminView();
		//av.viewmenu();
		av.adminMenuOptions();
		//return true;
   	  }else {
		System.out.println("you eneterd invalid username or pasword");
		LoginView login = new LoginView();
		login.Menu();
		//return false;
	  }
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//return false;
  }
}
/*private List<users> userLoginList = null;

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
}*/
