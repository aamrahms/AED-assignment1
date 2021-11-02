/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aamrah
 */
public class Community {
    private String communityName;
    private ArrayList<House> homes;
    private int healthCount;
    private int uniqueId,addit=0;
    private static int count=0;
    /*
    
    public void setCommunity(ArrayList<Community> communities) {
        this.communities = communities;
    }
    public void addCommunity(Community c){
        this.communities.add(c);
    }
    public void removeCommunity(int selectedCommunity){
       this.communities.remove(selectedCommunity);
    }
    public void updateCommunity(Community updateCommunity, int uniqueID) {
        this.communities.set(uniqueID, updateCommunity);
    }
    */

    public Community(String name,City city) {
        this.communityName=name;
        this.homes =new ArrayList();
        this.healthCount=0;
        this.uniqueId=count++;
        //addCommunityToCity(this,city);
    }
    
    public void addHouse(House h){
        this.homes.add(h);
        
    }
    public void addHouseToList(House h)
    {
        if(this.homes.isEmpty())
        {
            this.homes.add(h);
        }
        else
        {
            for(House temp: this.homes)
            {
                if(temp.getUniqueId()==h.getUniqueId())
                {
                    addit=1;
                    JOptionPane.showMessageDialog(null, h.getHomeName()+" already exists. Find another name", "Warning", JOptionPane.WARNING_MESSAGE);

                    break;
                }
            }
            if(addit==0)
                this.homes.add(h);
        }
         addit=0;
    }
    private void addCommunityToCity(Community com,City c) {
        c.addCommunityToList(com);
    }
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHomes() {
        return homes;
    }

    public void setHomes(ArrayList<House> homes) {
        this.homes = homes;
    }

    public int getHealthCount() {
        return healthCount;
    }

    public void setHealthCount(int healthCount) {
        this.healthCount = healthCount;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }    
}
