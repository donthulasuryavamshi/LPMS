package com.virtusa.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.virtusa.model.DataBaseModel;

public class DataBaseConnector {
	private static DataBaseModel dbmodel = new DataBaseModel();
	private static Connection con =null; 
	//static Logger log= Logger.getLogger(DataBaseConnector.class.getName());
	public static Connection initilizConnection() throws ClassNotFoundException, SQLException {
		//log.info("database connection connector is used");
		Class.forName(dbmodel.getDriver());
		con = DriverManager.getConnection(dbmodel.getUrl(),dbmodel.getUsername(),dbmodel.getPassword());
		return con;
		
		
	}
	public static void closeConnection() throws SQLException {
		con.close();
	}
}
