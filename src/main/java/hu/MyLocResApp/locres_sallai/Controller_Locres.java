package hu.MyLocResApp.locres_sallai;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller_Locres {

    
    @Autowired
     private Service_Locres LocResService;
 

    
    @CrossOrigin
    @GetMapping("/datalist")
     	public List<Location> getLocationList() {
        List<Location> locationList = LocResService.getLocationResourceTypes();
        return locationList;
	}
        
     @CrossOrigin
     @GetMapping("/deleteLocation/{id}")
     	public String deleteLocation(@PathVariable("id") int id) {
     
        
        if (LocResService.deleteLocation(id)) {
            
            System.out.println("Location deleted, locationID: " + id + " ");
            return id + ". location deleted";
          
        }
        else return "the " + id + ". id isn't exist!!";
       
	}
        
        @CrossOrigin
     @GetMapping("/addLocation/{id}/{name}/{description}/{maxcapacity}")
        
     	public String AddLocation(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("description") String description,@PathVariable("maxcapacity") int maxcapacity) {
        System.out.println("Location deleted, locationID: " + id + " ");
        
        if (LocResService.AddLocationToList(id,name,description,maxcapacity)) 
        {
            return id + ". location added";
        }
        else return "fail!!";
       
	}

}