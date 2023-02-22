/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Container {
    
    // Instance variables
    private int volume;
    
    // Constructor
    public Container() {
        this.volume = 0;
    }
    
    public int contains() {
        return this.volume;
    }
    
    public void add(int amount) {
        
        // If added amount is negative, NO liquid added
        if(amount < 0) {
            return;
        } // maximum capacity condition
        else if(amount + this.volume >= 100) {
            this.volume = 100;
        } else {
            this.volume += amount;
        }
    }
    
    public void remove(int amount) {
        // If amount removed is negative, NO liquid is removed
        if(amount < 0) {
            return;
        } // minimum capacity condition
        else if(this.volume <= amount) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }
    
    public String toString() {
        return this.volume + "/100";
    }
}
