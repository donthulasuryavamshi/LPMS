package com.casestudy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.virtusa.dbconnection.DataBaseConnector;

public class viewBatchesDao {
	public void viewBatchesDetails() throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnector.initilizConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from batch");
		System.out.println("-----------------------------------");
		while(rs.next()) {
			//System.out.println("executinggg");
			System.out.println(rs.getString(1) +"  "+rs.getInt(2)+ "  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+ "  "+rs.getString(6));
		}
	}

}
