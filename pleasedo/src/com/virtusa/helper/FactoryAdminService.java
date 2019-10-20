package com.virtusa.helper;
import com.virtusa.dao.UpdateProfileDao;
import com.virtusa.dao.UpdateProfileDaoImpl;
public class FactoryAdminService {
	public static UpdateProfileDao createUpdateProfileDao() {
		UpdateProfileDao updateProfileDao =new UpdateProfileDaoImpl();
		return updateProfileDao;
	}
}
