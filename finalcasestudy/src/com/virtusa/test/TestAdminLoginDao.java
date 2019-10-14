package com.virtusa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.casestudy.dao.AdminLoginAuthDao;

public class TestAdminLoginDao {

	@Test
	public void testAdminLoginVerification_positive() {
		AdminLoginAuthDao alad = new AdminLoginAuthDao();
		alad.adminLoginVerification("admin", "admin");
		assertNotNull(alad);
		//assertEquals(true, );
	}

}
