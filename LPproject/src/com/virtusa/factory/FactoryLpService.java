package com.virtusa.factory;

import com.virtusa.sesrvices.LPAddService;

public class FactoryLpService {

	public static LPAddService createLPServices() {
		LPAddService lpAddService=new LPAddService();
		return lpAddService;
		
	}
}
