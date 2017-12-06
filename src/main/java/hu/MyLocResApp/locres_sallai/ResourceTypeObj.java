/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.MyLocResApp.locres_sallai;

/**
 *
 * @author mad00772
 */
public class ResourceTypeObj {
      private int id;
    private String name;   
    private int quantity;
    public ResourceTypeObj(int id, String name, int quantity){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
    }
    public ResourceTypeObj(){
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

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
