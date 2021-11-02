/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aamrah
 */
public class Encounter {
    private String date;
    private int encounterId;
    private VitalSign vitals;
    private static int count=1;

    public Encounter(int BP) {
        this.date=String.valueOf(new Date());
        this.encounterId=count++;
        this.vitals= new VitalSign(BP);
    }
  
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

    public VitalSign getVitals() {
        return vitals;
    }

    public void setVitals(VitalSign vitals) {
        this.vitals = vitals;
    }
    
    
    
}
