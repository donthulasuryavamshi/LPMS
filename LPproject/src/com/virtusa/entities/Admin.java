package com.virtusa.entities;
public class Admin extends users {
  private String UserName;
  private String Password;
  public String getUserName() {
	//System.out.println(" 6 check controller ");
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
	return "Admin [UserName=" + UserName + ", Password=" + Password + "]";
  }
}
