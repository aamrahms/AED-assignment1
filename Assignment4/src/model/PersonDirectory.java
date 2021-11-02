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
public class PersonDirectory {
    private ArrayList <Person> peopleDir;
    
    public PersonDirectory()
    {
        this.peopleDir=new ArrayList();
    }

    public ArrayList<Person> getPeopleDir() {
        return peopleDir;
    }

    public void setPeopleDir(ArrayList<Person> peopleDir) {
        this.peopleDir = peopleDir;
    }
    public void addPersonDir(Person person) {
        this.peopleDir.add(person);
    }
    public void removePerson(int selectedPerson){
       this.peopleDir.remove(selectedPerson);
       
    }
    public void updatePerson(int index,Person updatePerson) {
        this.peopleDir.set(index,updatePerson);    
    }
  
    
   
}
