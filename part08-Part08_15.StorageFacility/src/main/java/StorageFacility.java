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

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> item = this.storage.get(storageUnit);
        
        if(item == null) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        } else {
            return item;
        }
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).size() == 0) {
            this.storage.remove(item);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnit = new ArrayList<>();
        
        for(String unit : this.storage.keySet()) {
            storageUnit.add(unit);
        }
        
        return storageUnit;
    }
}
