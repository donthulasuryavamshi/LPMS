package com.virtusa.entities;
public class users {
  //public 
  private String UserName;
  private String Password;
  public String getUserName() {
	//System.out.println("step 8 controlle check");
	return UserName;
  }
  public void setUserName(String userName) {
	UserName = userName;
  }
  public String getPassword() {
	return Password;
  }
  public void setPassword(String password) {
	Password = password;
  }
  @Override
  public String toString() {
	return "users [UserName=" + UserName + ", Password=" + Password + "]";
  }	
}