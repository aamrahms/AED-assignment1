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

public class City {
    private String cityName;
    private ArrayList<Community> communities;
    private int addit=0;
    public City(String cityName) {
        this.cityName = cityName;
        this.communities = new ArrayList();
    }
    
    public String getName() {
        return cityName;
    }

    public void setName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }
    public void setCommunity(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public void addCommunityToList(Community com){
        if(this.communities.isEmpty())
        {
            this.communities.add(com);
        }
        else
        {
            
            for(Community temp: this.communities)
            {
                if(temp.getCommunityName().equals(com.getCommunityName()))
                {
                    addit=1;
                    JOptionPane.showMessageDialog(null, com.getCommunityName()+" already exists. Find another name", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
            if(addit==0)
                this.communities.add(com);
        }
        addit=0;
            
        
    }
    /*public void removeCommunity(int selectedCommunity){
       this.communities.remove(selectedCommunity);
    }
    public void updateCommunity(Community updateCommunity, int uniqueID) {
        this.communities.set(uniqueID, updateCommunity);
    }
    */
    
}
