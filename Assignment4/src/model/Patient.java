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
public class Patient extends Person {
    private static int count=1;
    private int patientId;
    private EncounterHistory encounterhistory;
    private Person person;
    
    //CONSTRUCTER
    //String personName, int age, String address, City city, String phone, String pincode, Community community
    public Patient(Person p) {
        this.person=p;
        this.patientId=count++;
        p.setPatientId(this.patientId);
    }
    
     //GETTERS AND SETTERS
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    

   
    
}
