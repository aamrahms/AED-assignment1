/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    DeliveryMan deliveryMan;
    private ArrayList<DeliveryMan> deliveryManList;
    //Constructor
    public DeliveryManDirectory(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = new ArrayList<DeliveryMan>();
    }
    //get delivery man using delivery man's username
    public DeliveryMan getDeliveryMan(String deliveryusername){
        for(DeliveryMan d : deliveryManList)
        {
            d.getUsername().equalsIgnoreCase(deliveryusername);
            return d;
        }
        
        return null;
    }
    //create, delete and update deliveryman
    public DeliveryMan createDeliveryMan(String name, String username, String password, String address, String phone)
    {
        DeliveryMan deliveryman=new DeliveryMan(name,username,password,address,phone);
        deliveryManList.add(deliveryman);
        return deliveryman;
    }
    
    public void updateDeliveryMan(DeliveryMan deliveryman,String name, String username, String password, String address, String phone)
    {
        for(DeliveryMan delivery : deliveryManList)
        {
            if(delivery.getUsername().equalsIgnoreCase(username))
            {
                deliveryMan.setUsername(username);
                deliveryMan.setName(name);
                deliveryMan.setAddress(address);
                deliveryMan.setPhone(phone);
                break;
            }
        }
        
    }
    public void deleteDeliveryMan(DeliveryMan deliveryman)
    {
        deliveryManList.remove(deliveryman);
    }
    //getters and setters

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
    
    
}
