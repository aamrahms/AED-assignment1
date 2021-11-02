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
public class PatientDirectory {
    private ArrayList <Patient> patientDir;

    public PatientDirectory() {
        this.patientDir = new ArrayList();
    }
    

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public void addPatient(Patient patient) {
            this.patientDir.add(patient);
    }
    public void removePatient(Patient p){
       this.patientDir.remove(p);  
    }
    
   
}
