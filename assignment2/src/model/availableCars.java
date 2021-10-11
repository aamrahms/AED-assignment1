/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class availableCars {
    private ArrayList <Car> availableCars;
    
    public availableCars(){
        
    }       

    public availableCars(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }

    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }
    
    public void addCar(Car c){
        this.availableCars.add(c);
    }
    

}
