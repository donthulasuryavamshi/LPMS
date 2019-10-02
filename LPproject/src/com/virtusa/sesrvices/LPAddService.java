package com.virtusa.sesrvices;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.Daos.LpAddinDaoI;
import com.virtusa.entities.LP;
import com.virtusa.entities.LPDetails;
import com.virtusa.factory.FactoryLpAddDao;
import com.virtusa.models.LPAddModel;
public class LPAddService implements LpServices {
  private LpAddinDaoI lpAddinDao = null;
  public LPAddService() {
	// TODO Auto-generated constructor stub
	this.lpAddinDao=FactoryLpAddDao.createLpListDao();
  }
  @Override
  public boolean storeLpService(LPAddModel lpAddModel) {
	// TODO Auto-generated method stub
	LP lp = new LP();
	lp.setLpId(lpAddModel.getLpId());
	LPDetails lpDetails = new LPDetails();
	lpDetails.setLPfirstName(lpAddModel.getLpfirstName());
	lpDetails.setLPlastName(lpAddModel.getLplastName());
	lpDetails.setLPdetailsId(1);
	lpDetails.setLPemail(lpAddModel.getLpemail());
	lpDetails.setLPphoneNumber(lpAddModel.getLpphoneNumber());
	lp.setLPDetails(lpDetails);
	return lpAddinDao.addingLpDetails(lp);
  }
  @Override
  public List<LPAddModel> retreieveLPService() {
	// TODO Auto-generated method stub
	List<LP> lpDetailsList = lpAddinDao.viewLps();
	List<LPAddModel> lpAddModel = new ArrayList<>();
	for(LP lpList: lpDetailsList) {
	  LPAddModel lpModel = new LPAddModel();
	  lpModel.setLpId(lpList.getLpId());
      lpModel.setLpfirstName(lpList.getLPDetails().getLPfirstName());
	  lpModel.setLplastName(lpList.getLPDetails().getLPlastName());
	  lpModel.setLpemail(lpList.getLPDetails().getLPemail());
	  lpModel.setLpphoneNumber(lpList.getLPDetails().getLPphoneNumber());
      lpAddModel.add(lpModel);
    }
   return lpAddModel;
 }	
}