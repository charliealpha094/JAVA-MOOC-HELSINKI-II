/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public String toString() {
        return changeHistory.toString();
    }
    
    public double maxValue() {
        if(this.changeHistory.isEmpty()) {
            return 0;
        }
        
        double maxValue = 0;
        
        for(Double item : changeHistory) {
            if(item > maxValue) {
                maxValue = item;
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        if(this.changeHistory.isEmpty()) {
            return 0;
        }
        
        double minimum = Integer.MAX_VALUE;
        
        for(double item : this.changeHistory) {
            if(item < minimum) {
                minimum = item;
            }
        }
        return minimum;
    }
    
    public double average() {
        if(this.changeHistory.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        
        // loop to calculate the total of values in history
        for(Double item : changeHistory) {
            total += item;
        }
        return (double) total / this.changeHistory.size();
    }
    
}
