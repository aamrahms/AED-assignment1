/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aamrah
 */
public class Fleet {
    private ArrayList <Car> allCars;
    private String lastUpdated;
    private int count;
    
    public Fleet() {
        this.allCars = new ArrayList<Car>();
        this.lastUpdated = String.valueOf(new Date());
    }
    public void addCar(Car c){
        this.allCars.add(c);
        this.lastUpdated=String.valueOf(new Date());
    }
    public void removeCar(int selectedCar){
       this.allCars.remove(selectedCar);
       this.lastUpdated=String.valueOf(new Date());
    }
    public void updateCar(Car Updatecar, int uniqueID) {
        this.allCars.set(uniqueID, Updatecar);
        this.lastUpdated=String.valueOf(new Date());
    }

    public ArrayList<Car> getAllCars() {
        return allCars;
    }

    public void setAllCars(ArrayList<Car> allCars) {
        this.allCars = allCars;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

   
    
    
}
