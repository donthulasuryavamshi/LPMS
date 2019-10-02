package com.virtusa.repository;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.entities.LPDetails;
public class LPDetailsRepository {
 private static List<LPDetails> lpDetails =  new ArrayList<>();
  public static boolean add(LPDetails lpDetail) {
  //System.out.println("step 6"+lpDetail);
  //System.out.println(lpDetail);
   return lpDetails.add(lpDetail);		
  }
  public static List<LPDetails> get(){
	//System.out.println("de"+lpDetails);
	return lpDetails;
  }
}