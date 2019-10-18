package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.LpDetailsModel;

public interface LpDetailsListDao {
	public List<LpDetailsModel> lpDetailsListShow() throws Exception;
}
