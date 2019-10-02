package com.virtusa.entities;
public class LPDetails {
  private int LPdetailsId;
  private String LPfirstName;
  private String LPlastName;
  private String LPphoneNumber;
  private String LPemail;
  public int getLPdetailsId() {
	return LPdetailsId;
  }
  public void setLPdetailsId(int lPdetailsId) {
	LPdetailsId = lPdetailsId;
  }
  public String getLPfirstName() {
	return LPfirstName;
  }
  public void setLPfirstName(String lPfirstName) {
	LPfirstName = lPfirstName;
  }
  public String getLPlastName() {
	return LPlastName;
  }
  public void setLPlastName(String lPlastName) {
	LPlastName = lPlastName;
  }
  public String getLPphoneNumber() {
	return LPphoneNumber;
  }
  public void setLPphoneNumber(String lPphoneNumber) {
	LPphoneNumber = lPphoneNumber;
  }
  public String getLPemail() {
	return LPemail;
  }
  public void setLPemail(String lPemail) {
	LPemail = lPemail;
  }
  @Override
  public String toString() {
	return "LPDetails [LPdetailsId=" + LPdetailsId + ", LPfirstName=" + LPfirstName + ", LPlastName=" + LPlastName
			+ ", LPphoneNumber=" + LPphoneNumber + ", LPemail=" + LPemail + "]";
  }
}