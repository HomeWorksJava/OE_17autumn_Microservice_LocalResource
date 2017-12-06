/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.MyLocResApp.locres_sallai;

import java.util.ArrayList;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author mad00772
 */
 
@Service
public class Service_Locres {
    
    private ArrayList<Location> LocationResourceTypeList;
   

    public Service_Locres()
    {        
        LocationResourceTypeList=new ArrayList();
        Location nl;
        for (int i = 0; i < 10; i++) {
            nl = new Location(i,i +". Hely"," A(z) "+i+".hely ezekből áll ",120);
            nl.addResourceType(new ResourceTypeObj(0,"víz",(20+2*i)));
            nl.addResourceType(new ResourceTypeObj(0,"hó",(50-2*i)));        
            nl.addResourceType(new ResourceTypeObj(0,"szél",(40-2*i)));
            nl.addResourceType(new ResourceTypeObj(0,"fű",(10+2*i)));
          
            LocationResourceTypeList.add(nl);
        }
    }
   

    public ArrayList<Location> getLocationResourceTypes() {
        return LocationResourceTypeList;
    }
    
     public boolean isLocationinList(Location locObj) {
         
        boolean islocinlist=false;
        for (Location obj : LocationResourceTypeList )
        {
            if (obj.equals(locObj)==true) {
                
                islocinlist=true;
            }
        
        }
          
        return islocinlist;
     }
         
      
    

    public Location getLocationResourceTypes(int id) {
        for (Location obj : LocationResourceTypeList )
        {
            if (Objects.equals(obj.getId(), id))
                return obj;
        }
        return null;
    }


    public boolean deleteLocation(int id) {
        
        Location obj = getLocationResourceTypes(id);
        if (obj != null) {
            LocationResourceTypeList.remove(obj);
            return true;
        }
        return false;
    }
    
     
    
    
   

    public boolean AddLocationToList(int id, String LocationName,String description,int maxCapacity) {
        Location newobj = new Location(id, LocationName,description,maxCapacity);
        boolean added=false;
        
        if (isLocationinList(newobj)==false) {
            
             LocationResourceTypeList.add(newobj);
             added=true;
        }
        
       return added;
     
    }

	

}
