/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.getName() + "\n" + "  " + super.getAddress() + "\n" + 
                "  salary " + this.getSalary() + " euro/month";
    }
}
