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
public class EncounterHistory {
    private ArrayList <Encounter> encounters;

    public EncounterHistory() {
        this.encounters = new ArrayList();
    }
    
    //ADD,UPDATE,DELETE
    public void addEncounter(Encounter e){
        this.encounters.add(e);
        
    }
    public void removeEncounter(int selectedEncounter){
       this.encounters.remove(selectedEncounter);
       
    }
    public void updateEncounter(Encounter updateEncounter, int encounterId) {
        this.encounters.set(encounterId, updateEncounter);
       
    }
    //GETTERS AND SETTERS
    
    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }
    
}
