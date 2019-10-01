package com.workaround.entities;

import java.sql.Date;

/*
 * Name               Null     Type         
------------------ -------- ------------ 
LP_ID              NOT NULL NUMBER(8)    
LP_NAME                     VARCHAR2(20) 
LP_PHONE_NUMBER             NUMBER(10)   
LP_EMAIL                    VARCHAR2(20) 
LP_DATE_OF_BIRTH            DATE         
LP_DATE_OF_JOINING          DATE         

 */
public class LP {

		private int lpid;
		private String lpname;
		private int lpphonenumber;
		private String email;
		private Date lpdateofbirth;
		private Date lpdateofjoining;
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
		public int getLpphonenumber() {
			return lpphonenumber;
		}
		public void setLpphonenumber(int lpphonenumber) {
			this.lpphonenumber = lpphonenumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getLpdateofbirth() {
			return lpdateofbirth;
		}
		public void setLpdateofbirth(Date lpdateofbirth) {
			this.lpdateofbirth = lpdateofbirth;
		}
		public Date getLpdateofjoining() {
			return lpdateofjoining;
		}
		public void setLpdateofjoining(Date lpdateofjoining) {
			this.lpdateofjoining = lpdateofjoining;
		}
		@Override
		public String toString() {
			return "LP [lpid=" + lpid + ", lpname=" + lpname + ", lpphonenumber=" + lpphonenumber + ", email=" + email
					+ ", lpdateofbirth=" + lpdateofbirth + ", lpdateofjoining=" + lpdateofjoining + "]";
		}
		
		

}
