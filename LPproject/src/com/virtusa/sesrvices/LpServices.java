package com.virtusa.sesrvices;

import java.util.List;

import com.virtusa.models.LPAddModel;

public interface LpServices {

	public boolean storeLpService(LPAddModel lpAddModel);
	public List<LPAddModel> retreieveLPService();
}
