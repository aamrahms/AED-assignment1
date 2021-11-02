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
public class House {
    private String homeName;
    private ArrayList<Person> people;
    private int uniqueId;
    private static int count=0;

    public House(String name) {
        this.homeName=name;
        this.uniqueId=count++;
        
    }
    public void addHouseToCommunity(House h, Community com)
    {
        com.addHouseToList(h);
    }
    public void addPerson(Person p){
        this.people.add(p);
    }
    
    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
    
    
}
