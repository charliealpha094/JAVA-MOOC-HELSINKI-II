/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> licenses;
    
    public VehicleRegistry() {
        this.licenses = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.licenses.containsKey(licensePlate)) {
            return false;
        } else {
            this.licenses.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        if(this.licenses.containsKey(licensePlate)) {
            return this.licenses.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(this.licenses.containsKey(licensePlate)) {
            this.licenses.remove(licensePlate);
            return true;
        } 
        return false;
        
    }
    
    public void printLicensePlates() {
        // loop through license plates to print them
        for(LicensePlate licensePlate : this.licenses.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        // Prints the owners of the cars in the registry
        ArrayList<String> owners = new ArrayList<>();
        
        // loop through the licenses (registry) hashmap
        for(String owner : this.licenses.values()) {
            if(owners.contains(owner)) {
                continue;
            } else {
                owners.add(owner);
            }
        }
        for(String owner : owners) {
            System.out.println(owner);
        }
    }
}
