package com.virtusa.Daos;

import java.util.List;

import com.virtusa.entities.LP;

public class LpAddinDao implements LpAddinDaoI {

	@Override
	public boolean addingLpDetails(LP lp) {
		// TODO Auto-generated method stub
		return LPRepository.add(lp);
	}

	@Override
	public List<LP> viewLps() {
		// TODO Auto-generated method stub
		return LPRepository.get();
	}

	
}
