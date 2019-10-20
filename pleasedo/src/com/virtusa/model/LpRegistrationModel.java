package com.virtusa.model;

public class LpRegistrationModel {
	private int lpid;
	private String lpname;
	private String designation;
	private int contact;
	private String email;
	private String address;
	public int getLpid() {
		return lpid;
	}
	public void setLpid(int lpid) {
		this.lpid = lpid;
	}
	public String getLpname() {
		return lpname;
	}
	public void setLpname(String lpname) {
		this.lpname = lpname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "LpRegistrationModel [lpid=" + lpid + ", lpname=" + lpname + ", designation=" + designation
				+ ", contact=" + contact + ", email=" + email + ", address=" + address + "]";
	}
	
}
