/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.MyLocResApp.locres_sallai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mad00772
 */
public class Location {
      private int id;
    private String name;
     private String description;
    private int maxCapacity;
    private List<ResourceTypeObj> resourceTypes;
 
    
    public Location(int id, String name, String description, int maxCapacity){
        this.id=id;
        this.name=name;
        this.description=description;
        this.maxCapacity=maxCapacity;
        resourceTypes=new ArrayList<ResourceTypeObj>();      
    } 
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
     public int getmaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param id the id to set
     */
    public void setmaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
     public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the resourceTypes
     */
    public List<ResourceTypeObj> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * @param resourceTypes the resourceTypes to set
     */
    public void setResourceTypes(List<ResourceTypeObj> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
    public void addResourceType(ResourceTypeObj rt){
        this.resourceTypes.add(rt);
    }

    /**
     * @return the description
     */
   
}
