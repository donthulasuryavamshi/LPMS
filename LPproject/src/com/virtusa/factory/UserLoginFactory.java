package com.virtusa.factory;
import com.virtusa.Daos.UsersLoginDao;
//import com.virtusa.sesrvices.LoginServiceInterface;
import com.virtusa.sesrvices.MainService;
public class UserLoginFactory {
  public static UsersLoginDao createUserLoginDAO() {
	//System.out.println(" step 4 check controller");
	UsersLoginDao userDAO=new UsersLoginDao();
	return userDAO;
  }
  //public static LoginServiceInterface createUserLoginService() {
  public static MainService createUserLoginService() {
	//System.out.println("step 2 controll check");
	MainService userService=new MainService();
	return userService;
  }
}