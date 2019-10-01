package com.virtusa.entities;

public class LP {
	private int lpId;
	private LPDetails lpDetails;

	public int getLpId() {
		return lpId;
	}

	public void setLpId(int lpId) {
		this.lpId = lpId;
	}

	public LPDetails getLPDetails() {
		return lpDetails;
	}

	public void setLPDetails(LPDetails lpDetails) {
		this.lpDetails = lpDetails;
	}

	@Override
	public String toString() {
		return "LP [lpId=" + lpId + ", lpDetails=" + lpDetails + "]";
	}

	
	
}