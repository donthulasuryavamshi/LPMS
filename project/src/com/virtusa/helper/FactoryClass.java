package com.virtusa.helper;

import com.virtusa.dao.LpDetailsListDao;
import com.virtusa.dao.LpDetailsListImpl;
import com.virtusa.service.AdminOperationSerivcesImpl;
import com.virtusa.service.AdminOperationServices;

public class FactoryClass {
	public static LpDetailsListDao createLpDetailsListService() {
		LpDetailsListDao lpdetailsList = new LpDetailsListImpl();
		return lpdetailsList;
	}
	public static AdminOperationServices createAdminOperationService() {
		AdminOperationServices adminOperationService = new AdminOperationSerivcesImpl();
		return adminOperationService;
	}
}
