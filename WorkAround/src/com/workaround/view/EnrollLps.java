package com.workaround.view;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
/**
 * Name               Null     Type         
------------------ -------- ------------ 
LP_ID              NOT NULL NUMBER(8)    
LP_NAME                     VARCHAR2(20) 
LP_PHONE_NUMBER             NUMBER(10)   
LP_EMAIL                    VARCHAR2(20) 
LP_DATE_OF_BIRTH            DATE         
LP_DATE_OF_JOINING          DATE         

 */
//import com.workaround.entities.LP;

public class EnrollLps {
	//List<LP> emp = new ArrayList<>();

	public void lpsEnroll() {
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("candidate Id");
			int candidate_id=sc.nextInt();
			//emp.add(sc.nextInt());
			System.out.println("candidate Name:");
			String candidate_name = sc.next();
			System.out.println("candiate Phone Number");
			int phoneNumber = sc.nextInt();
			System.out.println("candidate Email");
			String email = sc.next();
		
			
			System.out.println("candidae DOB");
			//Date bod = sc.next();
			//java.sql.Date hireDate=new java.sql.Date(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
			//statement.setDate(6,hireDate);

			System.out.println("date of joing");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","hr");
			PreparedStatement preparestmt = con.prepareStatement("insert into lp values (?,?,?,?,?,?)");
			preparestmt.setInt(1, candidate_id);
			preparestmt.setString(2, candidate_name);
			preparestmt.setInt(3, phoneNumber);
			preparestmt.setString(4, email);
			preparestmt.setString(5,null);
			preparestmt.setString(6, null);
			int result = preparestmt.executeUpdate();
			if(result == 1) {
				System.out.println("inserted");
				AdminView av= new AdminView();
				av.viewmenu();
			}else {
				System.out.println("error");
			}
			
		}catch(Exception e) {
			//EnrollLps er= new EnrollLps();
			//er.lpsEnroll();
			e.printStackTrace();
		}
	}
}
