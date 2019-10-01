package com.virtusa.Daos;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.LP;

public class LPRepository {
	private static List<LP> lps = new ArrayList<>();
	public static boolean add(LP lp) {
		return lps.add(lp);
	}
	public static List<LP> get(){
		return lps;
	}
}
