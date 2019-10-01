package com.virtusa.view;

import java.util.List;

import com.virtusa.models.LPAddModel;

public class LPDetailsList {

public void displayLPDetails(List<LPAddModel> lpDetailsModel){
    	
    	lpDetailsModel.forEach(System.out::println);
    }
}
