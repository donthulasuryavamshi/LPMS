package com.virtusa.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.connector.DataBaseConnector;
import com.virtusa.model.LpDetailsModel;

public class LpDetailsListImpl implements LpDetailsListDao {

	@Override
	public List<LpDetailsModel> lpDetailsListShow() throws Exception {
		// TODO Auto-generated method stub
		Connection connection = DataBaseConnector.initilizConnection();
		Statement statement =connection.createStatement();
		List<LpDetailsModel> lpdetailslist = new ArrayList<LpDetailsModel>();
		ResultSet res = statement.executeQuery("select * from lp_details_table");
		while(res.next()) {
			LpDetailsModel lpdetailsmodel = new LpDetailsModel();
			lpdetailsmodel.setLpid(res.getString("lp_id"));
			lpdetailsmodel.setLastname(res.getString("first_name"));
			lpdetailsmodel.setFirstname(res.getString("last_name"));
			lpdetailsmodel.setDob(res.getDate("dob"));
			lpdetailsmodel.setPhonenumber(res.getString("phone_number"));
			lpdetailsmodel.setLpid(res.getString("lp_id"));
			lpdetailslist.add(lpdetailsmodel);
		}
	
		return lpdetailslist;
		
	}
}

