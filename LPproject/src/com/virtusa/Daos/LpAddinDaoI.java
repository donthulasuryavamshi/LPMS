package com.virtusa.Daos;
import java.util.List;
import com.virtusa.entities.LP;
public interface LpAddinDaoI {
 public boolean addingLpDetails(LP lp);
   public List<LP> viewLps();
}
