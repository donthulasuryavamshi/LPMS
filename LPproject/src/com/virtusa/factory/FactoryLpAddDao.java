package com.virtusa.factory;
import com.virtusa.Daos.LpAddinDao;
public class FactoryLpAddDao {
 public static LpAddinDao createLpListDao() {
	LpAddinDao lpAddinDao = new LpAddinDao();
	return lpAddinDao;
  }
}